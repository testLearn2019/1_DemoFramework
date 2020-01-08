package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Reusables.Reusable1;

public class Login2 {

	Reusable1 reuse = new Reusable1();
	WebDriver driver;
	
	public Login2(WebDriver vvdriver) {
		this.driver = vvdriver;
	}
	
	public void loginPage() {

		driver.findElement(By.id(reuse.readProperties("username"))).sendKeys(reuse.readExcel(0, 0));
		driver.findElement(By.id(reuse.readProperties("password"))).sendKeys(reuse.readExcel(0, 1));
		
		driver.findElement(By.id(reuse.readProperties("submitButton"))).click();
	
	}
}
