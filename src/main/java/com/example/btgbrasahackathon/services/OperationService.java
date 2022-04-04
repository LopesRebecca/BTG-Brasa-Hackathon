package com.example.btgbrasahackathon.services;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.example.btgbrasahackathon.entity.CustomerProposal;
import com.example.btgbrasahackathon.entity.IncreaseResponse;
import com.example.btgbrasahackathon.entity.RequestContent;
import com.example.btgbrasahackathon.entity.account.Balances;
import com.example.btgbrasahackathon.entity.account.BalancesDTO;
import com.example.btgbrasahackathon.entity.account.OverDraft;
import com.example.btgbrasahackathon.entity.account.Transations;
import com.example.btgbrasahackathon.entity.creditcard.AccountBill;
import com.example.btgbrasahackathon.entity.creditcard.CreditBillsDTO;
import com.example.btgbrasahackathon.entity.creditcard.CreditLimits;
import com.example.btgbrasahackathon.entity.creditcard.CreditTransations;
import com.example.btgbrasahackathon.exceptions.DeniedCreditException;

@Service
public class OperationService {

	@Autowired
	CreditService creditService;
	
	@Autowired
	AccountService accountService;
	
	@Autowired
	CustomerService customerService;
	
	public IncreaseResponse increaseCredit(String customerId, CustomerProposal organizations, String accountId) {
		try {
			//validations
			if(isAvaliableAmount(customerId, organizations, accountId)) {
				throw new DeniedCreditException("Denied1");
			}
			if(isValidBillingAmount(customerId, organizations)) {
				throw new DeniedCreditException("Denied2");
			}
			if(isUsedOverDraft(customerId, organizations, accountId)){
				throw new DeniedCreditException("Denied3");
			}
			if(isUsedEnoughCreditCard(customerId, organizations, accountId)) {
				throw new DeniedCreditException("Denied4");
			}
			
			//creditCalculation
			ArrayList<Double> limits = new ArrayList<Double>();
			
			for(RequestContent institution: organizations.getOrganizations()) {
				String CreditCardAccountId = institution.getCreditCardAccountId();
				String organizationId =institution.getOrganizationId();
				
				CreditLimits creditLimits = creditService.queryLimits(organizationId, customerId, CreditCardAccountId);
				creditLimits.getData().stream().forEach(c -> limits.add(c.getLimitAmount()));
			}
			
			Double newLimit = 0.0;
			Double oldLimit = 0.0;
			
			for(Double max : limits) {
				if (max >= newLimit) {
					newLimit = max;
				}
			}
			
			oldLimit = newLimit;
			newLimit *= 1.25;
			
			
			IncreaseResponse response = new IncreaseResponse();
			response.setCustomerId(customerId);
			response.setDateRequest(new Date());
			response.setNewLimit(newLimit);
			response.setOldLimit(oldLimit);
			response.setMessage("Credito aprovado");
			
			return response;
		} catch (DeniedCreditException e) {
			IncreaseResponse response = new IncreaseResponse();
			response.setCustomerId(customerId);
			response.setDateRequest(new Date());
			response.setMessage(e.getMessage());
			
			return response;
		}
	}

	private boolean isUsedEnoughCreditCard(String customerId, CustomerProposal organizations, String accountId) {
		int onAccount = 0;
		int onCreditCard = 0;
		
		for(RequestContent institution: organizations.getOrganizations()) {
			String CreditCardAccountId = institution.getCreditCardAccountId();
			String organizationId =institution.getOrganizationId();
			
			Transations accountTransactions = this.accountService.queryTransactions(organizationId, customerId, accountId);
			CreditTransations creditTransactions = this.creditService.queryTransactions(organizationId, customerId, CreditCardAccountId);
			
			
			onCreditCard += creditTransactions.getData().size();
			onAccount += accountTransactions.getData().size();
		}
		if (onCreditCard < onAccount) {
			return true;
		}
		return false;
	}

	private boolean isUsedOverDraft(String customerId, CustomerProposal organizations, String accountId) {
		for(RequestContent institution: organizations.getOrganizations()) {
			String CreditCardAccountId = institution.getCreditCardAccountId();
			String organizationId =institution.getOrganizationId();
			
			OverDraft clientBills = this.accountService.queryOverDraft(organizationId, customerId, accountId);
		
			if (clientBills.getData().getOverdraftUsedLimit() != 0){
				return true;
			}
			if(clientBills.getData().getUnarrangedOverdraftAmount() != 0) {
				return true;
			}
		}
		return false;
	}

	public boolean isValidBillingAmount(String customerId, CustomerProposal organizations) {
		for(RequestContent institution: organizations.getOrganizations()) {
			String CreditCardAccountId = institution.getCreditCardAccountId();
			String organizationId =institution.getOrganizationId();
			
			AccountBill clientBills = this.creditService.queryBills(organizationId, customerId, CreditCardAccountId);
		
			for(CreditBillsDTO bills : clientBills.getData()) {
				if (bills.getBillMinimumAmount() < bills.getBillTotalAmount()) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean isAvaliableAmount(String customerId, CustomerProposal organizations, String accountId) {
		for(RequestContent institution: organizations.getOrganizations()) {
			String organizationId =institution.getOrganizationId();
			
			Balances clientBalance = this.accountService.queryBalance(organizationId, customerId, accountId);
					
			if (clientBalance.getData().getAvailableAmount() < 0 ||
					clientBalance.getData().getBlockedAmount() != 0){
				return true;
			}
		}
		return false;
	}
}

