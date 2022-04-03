package com.example.btgbrasahackathon.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.btgbrasahackathon.entity.CustomerProposal;
import com.example.btgbrasahackathon.entity.IncreaseResponse;
import com.example.btgbrasahackathon.services.OperationService;

@RestController
@RequestMapping("/rest/operation")
public class OperationController {
	
	@Autowired
	OperationService operationService;
	
	@PostMapping("/credit")
	public ResponseEntity<?> creditIncrease(@RequestHeader("customerid") String customerId,
			@RequestBody CustomerProposal organizations){
		IncreaseResponse response = this.operationService.increaseCredit(customerId, organizations);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}
	
}
