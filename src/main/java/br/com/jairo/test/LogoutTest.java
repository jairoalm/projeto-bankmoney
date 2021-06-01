package br.com.jairo.test;

import org.junit.Assert;
import org.junit.Test;
import br.com.jairo.core.Listener;
import br.com.jairo.page.LogoutPage;


public class LogoutTest extends Listener{
	
	LogoutPage logout = new LogoutPage();
	
	@Test
	public void efetuarLogout() {
		logout.sairBotaoLogout();	
		
		Assert.assertEquals("Your Name :", logout.logoutRealizadoComSucesso());
	}

}
