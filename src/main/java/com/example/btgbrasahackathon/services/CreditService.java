package com.example.btgbrasahackathon.services;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.btgbrasahackathon.entity.creditcard.AccountBill;
import com.example.btgbrasahackathon.entity.creditcard.CreditAccount;
import com.example.btgbrasahackathon.entity.creditcard.CreditCardAccountId;
import com.example.btgbrasahackathon.entity.creditcard.CreditTransations;

@Service
public class CreditService {
	
	public CreditAccount queryCreditAccount(String organizationId, String customerId){
		String url = "https://challenge.hackathonbtg.com/credit-cards-accounts/v1/accounts";
		
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("organizationid", organizationId);
		headers.add("customerid", customerId);

		ResponseEntity<CreditAccount> response = restTemplate.exchange(url, HttpMethod.GET,
				new HttpEntity<Object>("",headers), CreditAccount.class);
		
		return response.getBody();
	}
	
	public CreditCardAccountId queryCreditId(String organizationId, String customerId, String creditCardAccountId){
		String url = "https://challenge.hackathonbtg.com/credit-cards-accounts/v1/accounts/" + creditCardAccountId ;
		
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("organizationid", organizationId);
		headers.add("customerid", customerId);

		ResponseEntity<CreditCardAccountId> response = restTemplate.exchange(url, HttpMethod.GET,
				new HttpEntity<Object>("",headers), CreditCardAccountId.class);
		
		return response.getBody();
	}
	
	public CreditTransations queryTransactions(String organizationId, String customerId, String creditCardAccountId){
		String url = "https://challenge.hackathonbtg.com/credit-cards-accounts/v1/accounts/" + creditCardAccountId +"/transactions" ;
		
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("organizationid", organizationId);
		headers.add("customerid", customerId);

		ResponseEntity<CreditTransations> response = restTemplate.exchange(url, HttpMethod.GET,
				new HttpEntity<Object>("",headers), CreditTransations.class);
		
		return response.getBody();
	}
	
	public AccountBill queryBills(String organizationId, String customerId, String creditCardAccountId){
		String url = "https://challenge.hackathonbtg.com/credit-cards-accounts/v1/accounts/" + creditCardAccountId + "/bills" ;
		
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("organizationid", organizationId);
		headers.add("customerid", customerId);

		ResponseEntity<AccountBill> response = restTemplate.exchange(url, HttpMethod.GET,
				new HttpEntity<Object>("",headers), AccountBill.class);
		
		return response.getBody();
	}
}	
