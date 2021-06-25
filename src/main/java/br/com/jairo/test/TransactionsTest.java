package br.com.jairo.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.jairo.accountPage.TransactionsPage;
import br.com.jairo.config.Listener;


public class TransactionsTest extends Listener {
	
	TransactionsPage transactions = new TransactionsPage();
	
	@Test
	public void validadeCustomerAccountTransactions() {
		transactions.buttonTransactions();
		
		Assert.assertEquals("500", transactions.checkDepositValue());
		Assert.assertEquals("100", transactions.checkValueWithdrawal());
		
		System.out.println("Deposito : R$ " + transactions.checkDepositValue());
		System.out.println("Saque : R$ " + transactions.checkValueWithdrawal());
	}

}
