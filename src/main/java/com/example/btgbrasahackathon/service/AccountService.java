package com.example.btgbrasahackathon.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.btgbrasahackathon.entity.account.Account;
import com.example.btgbrasahackathon.entity.account.Balances;

@Service
public class AccountService {
	
	public Account queryAccount(String organizationId, String customerId){
		String url = "https://challenge.hackathonbtg.com/credit-cards-accounts/v1/accounts";
		
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("organizationid", organizationId);
		headers.add("customerid", customerId);

		ResponseEntity<Account> response = restTemplate.exchange(url, HttpMethod.GET,
				new HttpEntity<Object>("",headers), Account.class);
		
		return response.getBody();
	}
	
	public Balances queryBalance(String organizationId, String customerId, String accountId) {
		String url = "https://challenge.hackathonbtg.com/accounts/v1/accounts/" + accountId + "/balances";
		
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("organizationid", organizationId);
		headers.add("customerid", customerId);

		ResponseEntity<Balances> response = restTemplate.exchange(url, HttpMethod.GET,
				new HttpEntity<Object>("",headers), Balances.class);
		
		return response.getBody();
	}
}
