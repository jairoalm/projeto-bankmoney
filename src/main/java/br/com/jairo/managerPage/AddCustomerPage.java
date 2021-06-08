package br.com.jairo.managerPage;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import br.com.jairo.config.DriverFatory;

public class AddCustomerPage {
	
	public void addCustomer() {
		DriverFatory.getDriver().findElement(By.xpath("//button[@ng-click='addCust()']")).click();
	}

	public String writeName(String name) {		
			DriverFatory.getDriver().findElement(By.xpath("//input[@ng-model='fName']")).sendKeys(name);
			return name;		
	}
	
	public String writeLastName(String lastName) {
		DriverFatory.getDriver().findElement(By.xpath("//input[@ng-model='lName']")).sendKeys(lastName);
		return lastName;
	}
	
	public String writeMailbox(String mailbox) {
		DriverFatory.getDriver().findElement(By.xpath("//input[@ng-model='postCd']")).sendKeys(mailbox);
		return mailbox;
	}

	public void registerbutton(){
		DriverFatory.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	public String  customerSavedSuccessfull(){			
		Alert alert = DriverFatory.getDriver().switchTo().alert();
		String sg = alert.getText();
		alert.accept();	
		assertThat(DriverFatory.getDriver().switchTo().alert().getText(), 
				is("Customer added successfully with customer id :6"));
		return sg;		
	}
	
}
