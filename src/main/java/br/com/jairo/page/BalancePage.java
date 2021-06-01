package br.com.jairo.page;

import org.openqa.selenium.By;

import br.com.jairo.core.DriverFatory;

public class BalancePage {
	
	public String validateAccountBalance(){
		return DriverFatory.getDriver().findElement(By.xpath("//strong[2]")).getText();
	}

}
