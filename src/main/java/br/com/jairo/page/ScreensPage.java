package br.com.jairo.page;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

import br.com.jairo.config.DriverFatory;

public class ScreensPage extends BasePage{
	
	public void accessHomeScreen(){
		DriverFatory.getDriver().get("http://www.way2automation.com/angularjs-protractor/banking/#/login");
	}
	
	public void accessHomeLogin(){
		DriverFatory.getDriver().get("http://www.way2automation.com/angularjs-protractor/banking/#/customer");
	}
	
	public void interactWithCustomerData(){
		DriverFatory.getDriver().get("http://www.way2automation.com/angularjs-protractor/banking/#/manager");
	}
		
	public void clickButtonCustomerHomeScreen() {
		clickButton(By.xpath("//button[@class='btn btn-primary btn-lg']"));
	}
			
	public void clickButtonManager(){
		DriverFatory.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		clickButton(By.xpath("//button[@ng-click='manager()']"));
	}	

}
