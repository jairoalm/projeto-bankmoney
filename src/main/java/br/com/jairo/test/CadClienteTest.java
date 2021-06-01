package br.com.jairo.test;

import org.junit.Assert;
import org.junit.Test;
import br.com.jairo.core.Listener;
import br.com.jairo.page.CadClientePage;



public class CadClienteTest extends Listener {
	
	private CadClientePage cliente = new CadClientePage();
	
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
