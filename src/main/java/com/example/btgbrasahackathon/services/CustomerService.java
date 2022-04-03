package com.example.btgbrasahackathon.services;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.btgbrasahackathon.entity.customers.CustomerQualifications;

@Service
public class CustomerService {
	
	public CustomerQualifications queryQualifications(String organizationId, String customerId){
		String url = "https://challenge.hackathonbtg.com/customers/v1/personal/qualifications";
		
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("organizationid", organizationId);
		headers.add("customerid", customerId);

		ResponseEntity<CustomerQualifications> response = restTemplate.exchange(url, HttpMethod.GET,
				new HttpEntity<Object>("",headers), CustomerQualifications.class);
		
		return response.getBody();
	}
}
