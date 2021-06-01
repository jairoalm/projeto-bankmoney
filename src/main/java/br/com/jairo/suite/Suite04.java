package br.com.jairo.suite;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.jairo.page.ScreensPage;
import br.com.jairo.test.OpenAccountTest;

@RunWith(Suite.class)
@SuiteClasses({
	OpenAccountTest.class
})
public class Suite04 {
	
    public static ScreensPage screensPage = new ScreensPage();
	
	@BeforeClass
	public static void acessaPage() {		
		screensPage.acessarTelaIncial();
		screensPage.clickButtonManager();	
	}
	
	

}
