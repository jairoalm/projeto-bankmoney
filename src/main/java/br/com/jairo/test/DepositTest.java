package br.com.jairo.test;

import org.junit.Assert;
import org.junit.Test;
import br.com.jairo.core.Listener;
import br.com.jairo.page.DepositPage;


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
