package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/SBI")
public class AcountController {

	@RequestMapping("/v1/public/account/{accountnumber}")
	String getPublicAccountLink(@PathVariable int accountnumber) {

		return "Public lik is " + accountnumber;
	}
	@RequestMapping("/v1/private/account/{accountnumber}")
	String getPrivateAccountLink(@PathVariable int accountnumber) {

		return "Private lik is " + accountnumber;
	}

}
