package com.junit.interfaces;

import java.util.List;

import com.junit.models.Account;
import com.junit.models.Transaction;

public interface AccountService {

	public Account createNewAccount(Account account);
	public Account updateAccount(Account account);
	public boolean removeAccount(Account account);
	public List<Transaction> listAllTransactions(Account account);
	
}
