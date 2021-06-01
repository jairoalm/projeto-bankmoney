package br.com.jairo.suite;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import br.com.jairo.page.ScreensPage;
import br.com.jairo.test.CadClienteTest;
import br.com.jairo.test.DeleteCliTest;


@RunWith(Suite.class)
@SuiteClasses({
	CadClienteTest.class,
	DeleteCliTest.class	
	
})
public class Suite01 {
	
	public static ScreensPage screensCustomer = new ScreensPage();
	
	@BeforeClass
	public static void acessaPage() {
		screensCustomer.interagirComDadosDoCliente();	
	}

}
