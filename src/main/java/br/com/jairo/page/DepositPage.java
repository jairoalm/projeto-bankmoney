package br.com.jairo.page;

import org.openqa.selenium.By;

import br.com.jairo.core.BasePage;
import br.com.jairo.core.DriverFatory;

public class DepositPage extends BasePage {
	
	public void btnDeposito(){
		DriverFatory.getDriver().findElement(By.xpath("//button[@ng-click='deposit()']")).click();
	}
	
	public String depositarValor(String valor){
		DriverFatory.getDriver().findElement(By.xpath("//input[@type='number']")).sendKeys(valor);
		return valor;
	}
	
	public void btnSalvar(){
		DriverFatory.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	public String depositoComSucesso(){
		return obterTexto(By.xpath("//span[contains(.,'Deposit Successful')]"));
	}

}
