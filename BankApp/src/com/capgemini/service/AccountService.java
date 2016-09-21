package com.capgemini.service;

import java.math.BigDecimal;

import com.capgemini.exception.InsufficientBalanceException;
import com.capgemini.exception.InsufficientInitialBalanceException;
import com.capgemini.exception.InvalidAccountNumberException;
import com.capgemini.model.Account;

public interface AccountService {

	public Account createAccount (int accountnum, BigDecimal initBal) throws InsufficientInitialBalanceException; 
	
	public Account showBalance (int accountnum) throws InvalidAccountNumberException;
	
	public Account depositAccount (int accountnum, BigDecimal depositAmount) throws InvalidAccountNumberException;
	
	public Account withdrawAccount (int accountnum, BigDecimal withdrawalAmount) throws InvalidAccountNumberException, InsufficientBalanceException;
	
}
