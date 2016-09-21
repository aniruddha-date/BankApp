package com.capgemini.test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.capgemini.exception.InsufficientInitialBalanceException;
import com.capgemini.model.Account;
import com.capgemini.repository.AccountRepository;
import com.capgemini.service.AccountService;
import com.capgemini.service.AccountServiceImpl;
import static org.mockito.Mockito.when;
public class AccountTest {

	@Mock
	AccountRepository accountRepository;
	
	AccountService accountService;
	
	
	@Before
	public void setUp()
	{
		MockitoAnnotations.initMocks(this);
		accountService = new AccountServiceImpl(accountRepository);
	}
	
	@Test (expected = com.capgemini.exception.InsufficientInitialBalanceException.class)
	public void whenAmountisLessThan500SystemShouldthrowException() throws InsufficientInitialBalanceException {
		
		accountService.createAccount(12345, new BigDecimal(400));
	}

	@Test 
	public void whenValidInformationIsGivenSystemCreatesAccountSuccessfully() throws InsufficientInitialBalanceException {
		
		/*Account newAcc = accountService.createAccount(12345, new BigDecimal(40));
		assertEquals(newAcc.getAmount(), new BigDecimal(1000));*/
		
		Account account = new Account(12345, new BigDecimal(1000));
		when(accountRepository.save(account)).thenReturn(true);
		
		assertEquals(account.getAccountNumber(),accountService.createAccount(12345, new BigDecimal(1000)).getAccountNumber());
		assertEquals(account.getAccountNumber(),accountService.createAccount(12345, new BigDecimal(1000)).getAccountNumber());
	}
}
