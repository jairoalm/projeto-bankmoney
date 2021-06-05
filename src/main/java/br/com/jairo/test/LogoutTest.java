package br.com.jairo.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.jairo.config.Listener;
import br.com.jairo.page.LogoutPage;
import br.com.menuPage.Menu;


public class LogoutTest extends Listener{
	
	LogoutPage logout = new LogoutPage();
	Menu menu = new Menu();
	
	@Test
	public void effectLogout() {
		menu.buttonLogout();	
		
		Assert.assertEquals("Your Name :", logout.logoutPerformedSuccessfully());
	}

}
