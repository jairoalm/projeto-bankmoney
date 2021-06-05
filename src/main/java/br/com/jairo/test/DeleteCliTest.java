package br.com.jairo.test;


import org.junit.Test;

import br.com.jairo.config.Listener;
import br.com.jairo.managerPage.customersPage;

public class DeleteCliTest extends Listener{
	
	customersPage delete = new customersPage(); 
	
	@Test
	public void deleteCliente() throws InterruptedException {
		delete.clicarBotaoCustomers();
		delete.deleteCliente();
		
		//Assert.assertEquals(5,6);
					
	}

}
