package com.example.btgbrasahackathon.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.example.btgbrasahackathon.entity.CustomerProposal;
import com.example.btgbrasahackathon.entity.IncreaseResponse;
import com.example.btgbrasahackathon.entity.RequestContent;
import com.example.btgbrasahackathon.entity.account.Balances;
import com.example.btgbrasahackathon.entity.account.OverDraft;
import com.example.btgbrasahackathon.entity.account.Transations;
import com.example.btgbrasahackathon.entity.creditcard.AccountBill;
import com.example.btgbrasahackathon.exceptions.DeniedCreditException;

@Service
public class OperationService {

	@Autowired
	CreditService creditService;
	
	@Autowired
	AccountService accountService;
	
	@Autowired
	CustomerService customerService;
	
	public IncreaseResponse increaseCredit(String customerId, CustomerProposal organizations) {
		try {
			//validations
			if(isAvaliableAmount(customerId, organizations)) {
				throw new DeniedCreditException("Denied1");
			}
			if(isValidBillingAmount(customerId, organizations)) {
				throw new DeniedCreditException("Denied2");
			}
			if(isUsedOverDraft(customerId, organizations)){
				throw new DeniedCreditException("Denied3");
			}
			if(isUsedEnoughCreditCard(customerId, organizations)) {
				throw new DeniedCreditException("Denied4");
			}
			
			//creditCalculation
			for(RequestContent institution: organizations.getOrganizations()) {
				String AccountId = institution.getCreditCardAccountId();
				String OrganizationId =institution.getOrganizationId();
				
				
			}
			return null;	
		} catch (DeniedCreditException e) {
			IncreaseResponse response = new IncreaseResponse();
			response.setCustomerId(customerId);
			response.setDateRequest(new Date());
			response.setIncrease(null);
			response.setNewLimit(null);
			response.setOldLimit(null);
			response.setMessage(e.getMessage());
			
			return response;
		}
	}

	private boolean isUsedEnoughCreditCard(String customerId, CustomerProposal organizations) {
		int totalUsed;
		int creditUsed;
		
		for(RequestContent institution: organizations.getOrganizations()) {
			String accountId = institution.getCreditCardAccountId();
			String organizationId =institution.getOrganizationId();
			
			Transations clientTransations = this.accountService.queryTransactions(organizationId, customerId, accountId);
			// TODO: verificar
			return true;
		}
		return false;
	}

	private boolean isUsedOverDraft(String customerId, CustomerProposal organizations) {
		for(RequestContent institution: organizations.getOrganizations()) {
			String accountId = institution.getCreditCardAccountId();
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
			String accountId = institution.getCreditCardAccountId();
			String organizationId =institution.getOrganizationId();
			
			AccountBill clientBills = this.creditService.queryBills(organizationId, customerId, accountId);
		
			if (clientBills.getData().getBillMinimumAmount() <	clientBills.getData().getBillTotalAmount()){
				return true;
			}
		}
		return false;
	}

	public boolean isAvaliableAmount(String customerId, CustomerProposal organizations) {
		for(RequestContent institution: organizations.getOrganizations()) {
			String accountId = institution.getCreditCardAccountId();
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
