package br.com.jairo.page;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

import br.com.jairo.config.DriverFatory;

public class ScreensPage {
	
	public void acessarTelaIncial(){
		DriverFatory.getDriver().get("http://www.way2automation.com/angularjs-protractor/banking/#/login");
	}
	
	public void acessarTelaLogin(){
		DriverFatory.getDriver().get("http://www.way2automation.com/angularjs-protractor/banking/#/customer");
	}
	
	public void interagirComDadosDoCliente(){
		DriverFatory.getDriver().get("http://www.way2automation.com/angularjs-protractor/banking/#/manager");
	}
		
	public void clicarBotaoCustomer() {
		DriverFatory.getDriver()
		.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).click();
	}
			
	public void clickButtonManager(){
		DriverFatory.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		DriverFatory.getDriver().findElement(By.xpath("//button[@ng-click='manager()']")).click();
	}	

}
