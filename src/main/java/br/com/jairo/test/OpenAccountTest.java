package br.com.jairo.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.jairo.config.Listener;
import br.com.jairo.managerPage.OpenAccountPage;


public class OpenAccountTest extends Listener {
	
	OpenAccountPage account = new OpenAccountPage();
	
	@Test
	public void customerAccount(){	
		account.clickButtonOpenAcc();
		account.selectCustomer();
		account.selectCurrency();	
		account.buttonProcess();
		
		Assert.assertEquals("Account created successfully with account Number :1016", account.accountCreatedSuccessfully());
		
		
	}

}
