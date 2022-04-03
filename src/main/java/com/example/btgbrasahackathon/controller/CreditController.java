package com.example.btgbrasahackathon.controller;

import com.example.btgbrasahackathon.entity.Request;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.btgbrasahackathon.service.AccountService;

@RestController
@RequiredArgsConstructor
@RequestMapping(value="/customer")
public class CreditController {

	AccountService accountService;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> creditAvaliable(@RequestHeader("customerid") String customerid,
											 @RequestHeader("organizationid") String organizationid){
		Request response = this.accountService.queryAccount(organizationid, customerid);

		return ResponseEntity.ok(response);
	}
	
}
