package com.capgemini.repository;

import com.capgemini.model.Account;

public class AccountRepositoryImpl {

	private AccountRepositoryImpl accntRepo = null;
	
	private AccountRepositoryImpl() {
		
	}
	
	public AccountRepositoryImpl getInstance() {
		if (this.accntRepo == null) {
			this.accntRepo = new AccountRepositoryImpl();
		} 
		return this.accntRepo;
	}
	
	private Account myAccount;
	
	/*@Override
	public boolean save(Account account) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Account searchAccount(int accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}
*/
}
