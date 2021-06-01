package br.com.jairo.core;

public class Propriedades {	
	
	//Para não fechar o browser a cada teste usar "false"
	public static boolean FECHAR_BROWSER = false;	
	
	//Por padrão o chrome.
	public static Browsers browser = Browsers.CHROME;	
	public enum Browsers{
		CHROME,
		FIREFOX, 
		IE,
	}

}
