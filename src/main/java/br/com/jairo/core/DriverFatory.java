package br.com.jairo.core;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFatory {
	
	private static WebDriver driver;

	private DriverFatory() {
	}

	//Definindo qual browser devo iniciar
	public static WebDriver getDriver() {
				
		if (driver == null) {
			switch (Property.browser) {
			case FIREFOX:
				driver = new FirefoxDriver();
				break;
			case CHROME:				
				driver = new ChromeDriver();
				break;
			case IE:
				driver = new InternetExplorerDriver();
			}
			driver.manage().window().maximize();
			DriverFatory.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		return driver;
	}
	
	//Finalizando o browser
	public static void killDriver(){
		if(driver != null){
			driver.quit();
			driver = null;
		}		
	}
	

}
