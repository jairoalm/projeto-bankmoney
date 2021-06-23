package br.com.jairo.managerPage;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import br.com.jairo.config.DriverFatory;
import br.com.jairo.page.BasePage;

public class OpenAccountPage extends BasePage {		
	
	public void clickButtonOpenAcc(){
		clickButton(By.xpath("//button[@ng-click='openAccount()']"));		
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
		clickButton(By.xpath("//button[@type='submit']"));
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
