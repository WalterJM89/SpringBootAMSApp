package com.spaceage.ams.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spaceage.ams.dao.AccountManagementSystemDAO;

@Component("amsBO")
public class AccountManagementSystemBO {
	@Autowired
	AccountManagementSystemDAO amsDAO;
	public double getBalance(String accountId) {
		return this.amsDAO.getBalance(accountId);
	}
}
