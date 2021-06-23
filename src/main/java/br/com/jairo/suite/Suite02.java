package br.com.jairo.suite;


import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.jairo.page.ScreensPage;
import br.com.jairo.test.LoginTest;
import br.com.jairo.test.LogoutTest;


@RunWith(Suite.class)
@SuiteClasses({
	LoginTest.class,
	LogoutTest.class
})
public class Suite02 {
	public static ScreensPage screenLogin = new ScreensPage();

	@BeforeClass
	public static void acessoCliente() {
		screenLogin.accessHomeScreen();
		screenLogin.clickButtonCustomerHomeScreen();
		
	}

}
