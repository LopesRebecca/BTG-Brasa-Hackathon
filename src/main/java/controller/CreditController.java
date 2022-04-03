package controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.Request;
import service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

@RestController
@RequestMapping(value="/customer")
public class CreditController {
	
	@Autowired
	AccountService accountService;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> creditAvaliable(@RequestHeader("customerid") String customerid,
			@RequestHeader("organizationid") String organizationid){
		Request response = this.accountService.queryAccount(organizationid, customerid);
		
		return ResponseEntity.ok(response);
	}
	
}
