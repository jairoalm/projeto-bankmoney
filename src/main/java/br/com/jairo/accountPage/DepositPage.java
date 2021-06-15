package br.com.jairo.accountPage;

import org.openqa.selenium.By;
import br.com.jairo.page.BasePage;

public class DepositPage extends BasePage {
	
	public void depositButton(){
		clickButton(By.xpath("//button[@ng-click='deposit()']"));
	}
	
	public void setDepositValue(String value){
		write(By.xpath("//input[@type='number']"), value);
	}
	
	public void save(){
		clickButton(By.xpath("//button[@type='submit']"));
	}
	
	public String successfullyDeposit(){
		return getText(By.xpath("//span[contains(.,'Deposit Successful')]"));
	}

}
