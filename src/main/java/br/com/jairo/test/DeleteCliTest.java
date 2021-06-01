package br.com.jairo.test;


import org.junit.Test;
import br.com.jairo.core.Listener;
import br.com.jairo.page.DeleteCliPage;

public class DeleteCliTest extends Listener{
	
	DeleteCliPage delete = new DeleteCliPage(); 
	
	@Test
	public void deleteCliente() throws InterruptedException {
		delete.clicarBotaoCustomers();
		delete.deleteCliente();
		
		//Assert.assertEquals(5,6);
					
	}

}
