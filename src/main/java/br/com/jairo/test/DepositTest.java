package br.com.jairo.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.jairo.accountPage.DepositPage;
import br.com.jairo.config.Listener;


public class DepositTest extends Listener{
	
	DepositPage deposito = new DepositPage();
	
	@Test
	public void depositarValorNaConta(){
		deposito.btnDeposito();
		deposito.depositarValor("500");
		deposito.btnSalvar();
		
		Assert.assertEquals("Deposit Successful", deposito.depositoComSucesso());
		System.out.println(deposito.depositoComSucesso());
	}

}
