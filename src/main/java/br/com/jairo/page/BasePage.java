package br.com.jairo.page;

import org.openqa.selenium.By;

import br.com.jairo.config.DriverFatory;

public class BasePage {
	

	//Para texto com xpath e css selector
	public String obterTexto(By by){
		return DriverFatory.getDriver().findElement(by).getText();
	}
	
	//Para texto com ID
	public String obterTexto(String id){
		return obterTexto(By.id(id));
	}

}
