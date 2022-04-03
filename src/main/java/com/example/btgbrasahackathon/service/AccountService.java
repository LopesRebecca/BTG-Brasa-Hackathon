package com.example.btgbrasahackathon.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.btgbrasahackathon.entity.Request;

@Service
public class AccountService {
	
	public Request queryAccount(String organizationId, String customerId){
		String url = "https://challenge.hackathonbtg.com/credit-cards-accounts/v1/accounts";
		
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("organizationid", organizationId);
		headers.add("customerid", customerId);
		System.out.print(123);
		ResponseEntity<Request> response = restTemplate.exchange(url, HttpMethod.GET,
				new HttpEntity<Object>("",headers), Request.class);
		
		return response.getBody();
	}
}
