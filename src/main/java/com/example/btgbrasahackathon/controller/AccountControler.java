package com.example.btgbrasahackathon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.btgbrasahackathon.entity.account.Account;
import com.example.btgbrasahackathon.entity.account.Balances;
import com.example.btgbrasahackathon.service.AccountService;

@RestController
@RequestMapping(value="/customer/account")
public class AccountControler {
	
	@Autowired
	AccountService accountService;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> accountQuery(@RequestHeader("customerid") String customerid,
			@RequestHeader("organizationid") String organizationid){	
		Account response = accountService.queryAccount(organizationid, customerid);
		return ResponseEntity.ok(response);
	}
	
}
