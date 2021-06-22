package br.com.jairo.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.jairo.accountPage.BalancePage;
import br.com.jairo.accountPage.TransactionsPage;
import br.com.jairo.config.Listener;

public class BalanceTest extends Listener {
	
	BalancePage balance = new BalancePage();	
	TransactionsPage transactions = new TransactionsPage();
	
	@Test
	public void AccountBalance() {
		transactions.buttonBack();
		
		Assert.assertEquals("400", balance.validateAccountBalance());
		
		System.out.println("Saldo : R$ " + balance.validateAccountBalance());
		
	}
	
}
