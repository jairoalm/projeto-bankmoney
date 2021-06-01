package br.com.jairo.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.jairo.core.Listener;
import br.com.jairo.page.BalancePage;
import br.com.jairo.page.TransactionsPage;

public class BalanceTest extends Listener {
	
	BalancePage balance = new BalancePage();	
	TransactionsPage transactions = new TransactionsPage();
	
	@Test
	public void verificaSaldoDaConta() {
		transactions.btnVoltar();
		Assert.assertEquals("400", balance.ValidarSaldoDaConta());
		System.out.println("Saldo : R$ " + balance.ValidarSaldoDaConta());
	}
	
}
