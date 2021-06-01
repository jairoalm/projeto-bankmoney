	package br.com.jairo.page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import br.com.jairo.core.BasePage;
import br.com.jairo.core.DriverFatory;


public class LoginPage extends BasePage {	
	
	
	public void selecionaComboUsuario(){
		WebElement element = DriverFatory.getDriver()
				.findElement(By.id("userSelect"));
		Select combo = new Select(element);
		combo.selectByVisibleText("Harry Potter");
	}
	
	public void clicarBotaoLogin() {
		DriverFatory.getDriver().findElement(By.xpath("//button[@class='btn btn-default']")).click();;
	}
	
	public String bemVindoCliente(){
		return obterTexto(By.xpath("//strong[contains(.,'Welcom')]"));
	}
	
	

}
