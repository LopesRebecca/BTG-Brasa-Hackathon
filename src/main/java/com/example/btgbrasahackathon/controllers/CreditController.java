package com.example.btgbrasahackathon.controllers;

import com.example.btgbrasahackathon.entity.creditcard.CreditAccount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.btgbrasahackathon.services.CreditService;

@RestController
@RequestMapping(value="/customer/credit")
public class CreditController {
	
	@Autowired
	CreditService creditService;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> accountCreditQuery(@RequestHeader("customerid") String customerid,
			@RequestHeader("organizationid") String organizationid){
		
		CreditAccount response = creditService.queryCreditAccount(organizationid, customerid);
				
		return ResponseEntity.ok(response);
	}
	@PatchMapping("/details")
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> detailCreditQuery(@RequestHeader("customerid") String customerid,
			@RequestHeader("organizationid") String organizationid){
		
		CreditAccount response = creditService.queryCreditAccount(organizationid, customerid);
				
		return ResponseEntity.ok(response);
	}
}
