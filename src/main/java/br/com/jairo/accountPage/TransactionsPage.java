package br.com.jairo.accountPage;

import org.openqa.selenium.By;

import br.com.jairo.config.DriverFatory;
import br.com.jairo.page.BasePage;

public class TransactionsPage extends BasePage {
	
	public void botaoTransacoes() {
		DriverFatory.getDriver().findElement(By.xpath("//button[@ng-class='btnClass1']")).click();
	}
	
	public String verificaDepositoRealizado(){
		return DriverFatory.getDriver().findElement(By.xpath("//tr[@id='anchor0']/td[2]")).getText();		
	}
	
	public String verificaSaqueRealizado(){
		return DriverFatory.getDriver().findElement(By.xpath("//tbody/tr[2]/td[2]")).getText();
	}
	
	public void btnVoltar(){
		DriverFatory.getDriver().findElement(By.xpath("//button[@ng-click='back()']")).click();		
	}
}
