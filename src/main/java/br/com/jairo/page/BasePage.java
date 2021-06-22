package br.com.jairo.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import br.com.jairo.config.DriverFatory;

public class BasePage {
	
	/***** Escrever no campo *****/
	
	public void write (By by, String text){
		DriverFatory.getDriver().findElement(by).sendKeys(text);		
	}
	public void write (String id, String text){
		write(By.id(id), text);
	}
	
	/***** Texto *****/
	
	public String getText(By by){
		return DriverFatory.getDriver().findElement(by).getText();
	}
	
	public String getText(String id){
		return getText(By.id(id));
	}
	
	/***** Alert *****/
	
	public String alertText(){
		Alert alert = DriverFatory.getDriver().switchTo().alert();
		return alert.getText();
	}
	
	public String alertTextOK(){
		Alert alert = DriverFatory.getDriver().switchTo().alert();
		String value = alert.getText();
		alert.accept();
		return value;
		
	}
	
	/***** Button *****/
	
	public void clickButton(By by){
		DriverFatory.getDriver().findElement(by).click();		
	}
	public void clckButton(String id){
		clickButton(By.id(id));
	}

}
