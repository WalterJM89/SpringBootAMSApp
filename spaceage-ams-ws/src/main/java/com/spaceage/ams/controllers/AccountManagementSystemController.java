package com.spaceage.ams.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spaceage.ams.bo.AccountManagementSystemBO;

@RequestMapping("/ams")
@RestController
public class AccountManagementSystemController {
	@Autowired
	AccountManagementSystemBO amsBO;
	@GetMapping("/getBalance")
	public @ResponseBody double getBalance(@RequestParam("accountId")String accountId) {
		return this.amsBO.getBalance(accountId);
	}
}