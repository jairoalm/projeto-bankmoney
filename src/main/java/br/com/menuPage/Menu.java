package br.com.menuPage;

import org.openqa.selenium.By;

import br.com.jairo.config.DriverFatory;

public class Menu {
	
	public void clickHome(){
		DriverFatory.getDriver().findElement(By.xpath("//button[@class='btn home']")).click();		
	}
	
	public void buttonLogout(){
		DriverFatory.getDriver()
		.findElement(By.xpath("//button[@class='btn logout']")).click();		
	}

}
