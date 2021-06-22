package br.com.jairo.page;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

import br.com.jairo.config.DriverFatory;

public class ScreensPage {
	
	private BasePage page = new BasePage();
	
	public void acessarTelaIncial(){
		DriverFatory.getDriver().get("http://www.way2automation.com/angularjs-protractor/banking/#/login");
	}
	
	public void acessarTelaLogin(){
		DriverFatory.getDriver().get("http://www.way2automation.com/angularjs-protractor/banking/#/customer");
	}
	
	public void interagirComDadosDoCliente(){
		DriverFatory.getDriver().get("http://www.way2automation.com/angularjs-protractor/banking/#/manager");
	}
		
	public void clickButtonCustomer() {
		page.clickButton(By.xpath("//button[@class='btn btn-primary btn-lg']"));
	}
			
	public void clickButtonManager(){
		DriverFatory.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		page.clickButton(By.xpath("//button[@ng-click='manager()']"));
	}	

}
