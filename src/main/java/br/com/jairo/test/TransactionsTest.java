package br.com.jairo.test;

import org.junit.Assert;
import org.junit.Test;
import br.com.jairo.core.Listener;
import br.com.jairo.page.TransactionsPage;


public class TransactionsTest extends Listener {
	
	TransactionsPage transacoes = new TransactionsPage();
	
	@Test
	public void validarTransacoesDaConta() {
		transacoes.botaoTransacoes();
		Assert.assertEquals("500", transacoes.verificaDepositoRealizado());
		Assert.assertEquals("100", transacoes.verificaSaqueRealizado());
		System.out.println("Deposito : R$ " + transacoes.verificaDepositoRealizado());
		System.out.println("Saque : R$ " + transacoes.verificaSaqueRealizado());
	}

}
