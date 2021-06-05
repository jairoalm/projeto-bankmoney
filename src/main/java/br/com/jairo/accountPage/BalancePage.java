package br.com.jairo.accountPage;

import org.openqa.selenium.By;

import br.com.jairo.config.DriverFatory;

public class BalancePage {
	
	public String validateAccountBalance(){
		return DriverFatory.getDriver().findElement(By.xpath("//strong[2]")).getText();
	}

}
