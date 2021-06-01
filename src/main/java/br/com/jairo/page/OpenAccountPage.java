package br.com.jairo.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import br.com.jairo.core.DriverFatory;

public class OpenAccountPage {		
	
	public void clickButtonOpenAcc(){
		DriverFatory.getDriver().findElement(By.xpath("//button[@ng-click='openAccount()']")).click();		
	}
	
	public void selectCustomer(){
		
		WebElement element = DriverFatory.getDriver()
				.findElement(By.id("userSelect"));
		Select combo = new Select(element);
		combo.selectByVisibleText("Harry Potter");
	}
	
	public void selectCurrency(){
		WebElement element = DriverFatory.getDriver()
				.findElement(By.id("currency"));
		Select combo = new Select(element);
		combo.selectByVisibleText("Dollar");
	}
	public void buttonProcess(){
		DriverFatory.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	public String  accountCreatedSuccessfully(){	
		assertThat(DriverFatory.getDriver().switchTo().alert().getText(), 
				is("Account created successfully with account Number :1016"));
		Alert alert = DriverFatory.getDriver().switchTo().alert();			
		String value = alert.getText();		
		alert.accept();	
		return value;
	}
}
