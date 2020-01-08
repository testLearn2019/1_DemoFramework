package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Reusables.Reusable1;

public class Login1 {
	
	WebDriver driver;
	Reusable1 reuse = new Reusable1();
	
	 public Login1(WebDriver ldriver) {
		 this.driver = ldriver;
	 }
    
	 public void Login1Test() {
		 
		 driver.findElement(By.id("username")).sendKeys("Admin");
		 driver.findElement(By.id("password")).sendKeys("admin123");
		 driver.findElement(By.id("loginbutton")).click();
	 }
		 
}
