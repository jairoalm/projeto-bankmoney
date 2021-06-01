package br.com.jairo.test;

import org.junit.Assert;
import org.junit.Test;
import br.com.jairo.core.Listener;
import br.com.jairo.page.WithdrawalPage;

public class WithdrawalTest extends Listener {
	
	
	private WithdrawalPage withdrawal = new WithdrawalPage();
	
	@Test
	public void realizarSaque() throws InterruptedException {
		withdrawal.withdrawButton();
		try{
			withdrawal.withdrawalAmount("100");
			withdrawal.saveValueWithdrawal();
			Assert.assertEquals("Transaction successful", withdrawal.successfulWithdrawal());
		}catch(Exception e){
			Assert.assertEquals("Transaction Failed. You can not withdraw amount more than the balance.", withdrawal.errorWithdrawing());
		}		
		//System.out.println(sacar.saqueRealizadoComSucesso());
	}
}
