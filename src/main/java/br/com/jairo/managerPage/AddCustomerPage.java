package br.com.jairo.managerPage;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import br.com.jairo.config.DriverFatory;
import br.com.jairo.page.BasePage;

public class AddCustomerPage extends BasePage {

	public void addCustomer() {
		clickButton(By.xpath("//button[@ng-click='addCust()']"));
	}

	public void setWriteName(String name) {
		write(By.xpath("//input[@ng-model='fName']"), name);
	}

	public void setWriteLastName(String lastName) {
		write(By.xpath("//input[@ng-model='lName']"), lastName);
	}

	public void setWriteMailbox(String mailbox) {
		write(By.xpath("//input[@ng-model='postCd']"), mailbox);
	}

	public void registerbutton() {
		clickButton(By.xpath("//button[@type='submit']"));
	}

	public String getCustomerSavedSuccessfull() {
		assertThat(DriverFatory.getDriver().switchTo().alert().getText(),
				is("Customer added successfully with customer id :6"));
		return alertTextOK();
	}

}
