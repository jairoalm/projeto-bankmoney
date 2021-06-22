package br.com.jairo.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.jairo.config.Listener;
import br.com.jairo.managerPage.AddCustomerPage;



public class CadClienteTest extends Listener {
	
	private AddCustomerPage client = new AddCustomerPage();
	
	@Test
	public void addCliente(){	
		
		client.addCustomer();
		client.setWriteName("Jairo");
		client.setWriteLastName("Almeida");
		client.setWriteMailbox("58706362");
		client.registerbutton();		
				
	    Assert.assertEquals("Customer added successfully with customer id :6", client.getCustomerSavedSuccessfull());
		
				
	}
		
}
