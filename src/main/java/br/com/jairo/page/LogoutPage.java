package br.com.jairo.page;


import org.openqa.selenium.By;

public class LogoutPage extends BasePage{
	
	public String logoutPerformedSuccessfully(){
		return getText(By.xpath("//label[contains(.,'Your Name :')]"));
	}

}
