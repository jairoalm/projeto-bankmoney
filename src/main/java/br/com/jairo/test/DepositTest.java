package br.com.jairo.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.jairo.accountPage.DepositPage;
import br.com.jairo.config.Listener;


public class DepositTest extends Listener{
	
	DepositPage deposit = new DepositPage();
	
	@Test
	public void depositValueInCustomerAccount(){
		deposit.depositButton();
		deposit.setDepositValue("500");
		deposit.save();
		
		Assert.assertEquals("Deposit Successful", deposit.successfullyDeposit());
		
	}

}
