package br.com.jairo.test;


import org.junit.Test;

import br.com.jairo.config.Listener;
import br.com.jairo.managerPage.DeleteCustomersPage;


public class DeleteCliTest extends Listener{
	
	DeleteCustomersPage delete = new DeleteCustomersPage(); 
	
	@Test
	public void deleteCliente() throws InterruptedException {
		delete.clickButtonCustomers();
		delete.deleteCustomer();
								
	}

}
