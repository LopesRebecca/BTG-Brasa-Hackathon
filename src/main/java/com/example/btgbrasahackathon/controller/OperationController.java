package com.example.btgbrasahackathon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.btgbrasahackathon.service.OperationService;

@RestController
@RequestMapping("/rest/operation")
public class OperationController {
	
	@Autowired
	OperationService operationService;
	
	@PostMapping("/credit")
	public ResponseEntity<?> creditIncrease(@RequestHeader("customerid") String customerId,
			@RequestBody customerProposal organizations){
		organizations.toString();
		return null;
	}
	
}
