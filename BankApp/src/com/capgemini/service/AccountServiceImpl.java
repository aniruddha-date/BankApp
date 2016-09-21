package com.capgemini.service;

import java.math.BigDecimal;

import com.capgemini.exception.InsufficientBalanceException;
import com.capgemini.exception.InsufficientInitialBalanceException;
import com.capgemini.exception.InvalidAccountNumberException;
import com.capgemini.model.Account;
import com.capgemini.repository.AccountRepository;

public class AccountServiceImpl implements AccountService {

	AccountRepository accountRepository;
	
	public AccountServiceImpl(AccountRepository accountRepository)
	{
		this.accountRepository=accountRepository;
	}
		
	@Override
	public Account createAccount(int accountnum, BigDecimal initBal) throws InsufficientInitialBalanceException {
		
		Account account = new Account(accountnum, initBal);
		if (initBal.compareTo(new BigDecimal(500.00)) < 0) {
			throw new InsufficientInitialBalanceException(initBal + " is less than the minimum initial Balance requried, Rs 500.");
		}
		 if (this.accountRepository.save(account) ) {
			 return account;
		 } else {
			 return null;
		 }
		 
	}

	@Override
	public Account showBalance(int accountnum) throws InvalidAccountNumberException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account depositAccount(int accountnum, BigDecimal depositAmount) throws InvalidAccountNumberException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account withdrawAccount(int accountnum, BigDecimal withdrawalAmount)
			throws InvalidAccountNumberException, InsufficientBalanceException {
		// TODO Auto-generated method stub
		return null;
	}

}
