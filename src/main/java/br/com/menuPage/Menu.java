package br.com.menuPage;

import org.openqa.selenium.By;
import br.com.jairo.page.BasePage;

public class Menu {
	
	private BasePage page = new BasePage();
	
	public void clickHome(){
		page.clickButton(By.xpath("//button[@class='btn home']"));		
	}
	
	public void buttonLogout(){
		page.clickButton(By.xpath("//button[@class='btn logout']"));		
	}

}
