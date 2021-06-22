package br.com.jairo.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.jairo.accountPage.TransactionsPage;
import br.com.jairo.config.Listener;


public class TransactionsTest extends Listener {
	
	TransactionsPage transactions = new TransactionsPage();
	
	@Test
	public void validadeAccountTransaction() {
		transactions.buttonTrasactions();
		
		Assert.assertEquals("500", transactions.checkDeposit());
		Assert.assertEquals("100", transactions.checkWithdraw());
		
		System.out.println("Deposit : R$ " + transactions.checkDeposit());
		System.out.println("Withdraw : R$ " + transactions.checkWithdraw());
	}

}
