package br.com.jairo.managerPage;

import org.openqa.selenium.By;
import br.com.jairo.page.BasePage;

public class DeleteCustomersPage {
	
	private BasePage page = new BasePage();
	
	public void clicarBotaoCustomers(){
		page.clickButton(By.xpath("//button[@ng-click='showCust()']"));		
	}
	
	public void deleteCustomer() {	
		page.clickButton(By.xpath("//tbody/tr[6]/td[5]/button[contains(.,'Delete')]"));
			
	}

}
