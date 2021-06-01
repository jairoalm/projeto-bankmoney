package br.com.jairo.page;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import br.com.jairo.core.DriverFatory;

public class CadClientePage {
	
	public void addCustomer() {
		DriverFatory.getDriver().findElement(By.xpath("//button[@ng-click='addCust()']")).click();
	}

	public String escreverNome(String nome) {		
			DriverFatory.getDriver().findElement(By.xpath("//input[@ng-model='fName']")).sendKeys(nome);
			return nome;		
	}
	
	public String escreverSobreNome(String sobreNome) {
		DriverFatory.getDriver().findElement(By.xpath("//input[@ng-model='lName']")).sendKeys(sobreNome);
		return sobreNome;
	}
	
	public String escreverCep(String cep) {
		DriverFatory.getDriver().findElement(By.xpath("//input[@ng-model='postCd']")).sendKeys(cep);
		return cep;
	}

	public void btnCadastrar(){
		DriverFatory.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	public String  clienteSalvoComSucesso(){	
		assertThat(DriverFatory.getDriver().switchTo().alert().getText(), 
				is("Customer added successfully with customer id :6"));
		Alert alert = DriverFatory.getDriver().switchTo().alert();
		String sg = alert.getText();
		alert.accept();	
		return sg;
	}
	
}
