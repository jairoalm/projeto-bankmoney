package br.com.jairo.managerPage;

import org.openqa.selenium.By;
import br.com.jairo.page.BasePage;

public class DeleteCustomersPage extends BasePage {
	
	//private BasePage page = new BasePage();
	
	public void clickButtonCustomers(){
		clickButton(By.xpath("//button[@ng-click='showCust()']"));		
	}
	
	public void deleteCustomer() {	
		clickButton(By.xpath("//tbody/tr[6]/td[5]/button[contains(.,'Delete')]"));
			
	}

}
