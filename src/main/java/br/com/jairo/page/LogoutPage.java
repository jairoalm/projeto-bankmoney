package br.com.jairo.page;


import org.openqa.selenium.By;

import br.com.jairo.core.BasePage;
import br.com.jairo.core.DriverFatory;

public class LogoutPage extends BasePage{
	
	public void sairBotaoLogout(){
		DriverFatory.getDriver()
		.findElement(By.xpath("//button[@class='btn logout']")).click();		
	}
	
	public String logoutRealizadoComSucesso(){
		return obterTexto(By.xpath("//label[contains(.,'Your Name :')]"));
	}

}
