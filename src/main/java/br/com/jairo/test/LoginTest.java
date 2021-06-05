package br.com.jairo.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.jairo.config.Listener;
import br.com.jairo.loginPage.LoginPage;

//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginTest extends Listener {
	
	LoginPage login = new LoginPage();
			
	@Test
	public void efetuarLoginCliente() throws InterruptedException{		
		login.selecionaComboUsuario();
		login.clicarBotaoLogin();	
		
		Assert.assertEquals("Welcome Harry Potter !!", login.bemVindoCliente());
		System.out.println("Bem vindo: " + login.bemVindoCliente());
	}
}
