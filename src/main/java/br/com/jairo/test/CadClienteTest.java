package br.com.jairo.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.jairo.config.Listener;
import br.com.jairo.managerPage.AddCustomerPage;



public class CadClienteTest extends Listener {
	
	private AddCustomerPage cliente = new AddCustomerPage();
	
	@Test
	public void addCliente(){	
		
		cliente.addCustomer();
		cliente.escreverNome("Jairo");
		cliente.escreverSobreNome("Almeida");
		cliente.escreverCep("58706362");
		cliente.btnCadastrar();		
				
	    Assert.assertEquals("Customer added successfully with customer id :6", cliente.clienteSalvoComSucesso());
		
				
	}
		
}
