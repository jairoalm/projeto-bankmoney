package br.com.menuPage;

import org.openqa.selenium.By;
import br.com.jairo.page.BasePage;

public class Menu extends BasePage {
	
	public void clickHome(){
		clickButton(By.xpath("//button[@class='btn home']"));		
	}
	
	public void buttonLogout(){
		clickButton(By.xpath("//button[@class='btn logout']"));		
	}

}
