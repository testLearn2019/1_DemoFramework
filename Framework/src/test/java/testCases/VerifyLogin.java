package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Reusables.Reusable1;
import pages.Login1;


public class VerifyLogin {
      
	Reusable1 reuse = new Reusable1();
	Login1 login;
	WebDriver driver;
	
	 @BeforeTest
     public void browserSetup() {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\OneDrive\\Documents\\Harika\\Maventest\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();
			driver.get(reuse.readProperties("appURL"));
		}
	 
	 @Test
	 public void verifyTestcase() {
		 
		 login = new Login1(driver);
		 login.Login1Test();
		 
	 }
}
