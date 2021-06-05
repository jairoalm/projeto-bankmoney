package br.com.jairo.managerPage;

import org.openqa.selenium.By;

import br.com.jairo.config.DriverFatory;

public class customersPage {
	
	public void clicarBotaoCustomers(){
		DriverFatory.getDriver().findElement(By.xpath("//button[@ng-click='showCust()']")).click();		
	}
	
	public void deleteCliente() {	
		DriverFatory.getDriver()
		.findElement(By.xpath("//tbody/tr[6]/td[5]/button[contains(.,'Delete')]")).click();
			
	}

}
