package com.spaceage.ams.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository("amsDAO")
public class AccountManagementSystemDAO {

	private Map<String, Double> accountBalanceMap;
	
	public AccountManagementSystemDAO() {
		this.accountBalanceMap = new HashMap<String, Double>();
		this.accountBalanceMap.put("111", 1111.11);
		this.accountBalanceMap.put("222", 2222.22);
		this.accountBalanceMap.put("333", 3333.33);
	}
	
	public double getBalance(String accountId) {
		Double balance = this.accountBalanceMap.get(accountId);
		if(balance == null)
			balance = 0.0;
		return balance;
	}
}
