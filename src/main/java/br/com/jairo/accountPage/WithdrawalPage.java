package br.com.jairo.accountPage;

import org.openqa.selenium.By;
/*import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;*/

import br.com.jairo.config.DriverFatory;
import br.com.jairo.page.BasePage;

public class WithdrawalPage extends BasePage {

	public void withdrawButton() {
		DriverFatory.getDriver().findElement(By.xpath("//button[contains(.,'Withdrawl')]")).click();
	}

	public void setWithdrawalValue(String value) throws InterruptedException {
		Thread.sleep(2000);
		/*
		 * WebDriverWait wait = new WebDriverWait(DriverFatory.getDriver(), 60);
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//input[@type='number']")));
		 */
		DriverFatory.getDriver().findElement(By.xpath("//input[@type='number']")).sendKeys(value);
    }

	public void saveValueWithdrawal() {
		DriverFatory.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
	}

	public String successfulWithdrawal() {
		return getText(By.xpath("//span[contains(.,'Transaction successful')]"));
	}

	public String errorWithdrawing() {
		return getText(By
				.xpath("//span[contains(.,'Transaction Failed. You can not withdraw amount more than the balance.')]"));
	}

}
