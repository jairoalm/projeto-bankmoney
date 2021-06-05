package br.com.jairo.page;


import org.openqa.selenium.By;

public class LogoutPage extends BasePage{
	
	public String logoutPerformedSuccessfully(){
		return obterTexto(By.xpath("//label[contains(.,'Your Name :')]"));
	}

}
