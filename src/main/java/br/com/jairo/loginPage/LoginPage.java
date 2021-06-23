	package br.com.jairo.loginPage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import br.com.jairo.config.DriverFatory;
import br.com.jairo.page.BasePage;


public class LoginPage extends BasePage {		
	
	public void selecComboUser(){
		WebElement element = DriverFatory.getDriver()
				.findElement(By.id("userSelect"));
		Select combo = new Select(element);
		combo.selectByVisibleText("Harry Potter");
	}
	
	public void clickButtonLogin() {
		clickButton(By.xpath("//button[@class='btn btn-default']"));
	}
	
	public String welcomeCustomer(){
		return getText(By.xpath("//strong[contains(.,'Welcom')]"));
	}
	
	

}
