package br.com.jairo.accountPage;

import org.openqa.selenium.By;
import br.com.jairo.page.BasePage;

public class BalancePage extends BasePage{
	
	public String validateAccountBalance(){
		return getText(By.xpath("//strong[2]"));
	}

}
