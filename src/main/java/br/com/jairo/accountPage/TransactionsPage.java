package br.com.jairo.accountPage;

import org.openqa.selenium.By;
import br.com.jairo.page.BasePage;

public class TransactionsPage extends BasePage {
	
	public void buttonTrasactions() {
		clickButton(By.xpath("//button[@ng-class='btnClass1']"));
	}
	
	public String checkDeposit(){
		return getText(By.xpath("//tr[@id='anchor0']/td[2]"));		
	}
	
	public String checkWithdraw(){
		return getText(By.xpath("//tbody/tr[2]/td[2]"));
	}
	
	public void buttonBack(){
		clickButton(By.xpath("//button[@ng-click='back()']"));		
	}
}
