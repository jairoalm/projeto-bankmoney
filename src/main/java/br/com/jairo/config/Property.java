package br.com.jairo.config;

public class Property {	
	
	//To not close the browser at each test use "false"
	public static boolean FECHAR_BROWSER = false;	
	
	//By default the chrome.
	public static Browsers browser = Browsers.CHROME;	
	public enum Browsers{
		CHROME,
		FIREFOX, 
		IE,
	}

}
