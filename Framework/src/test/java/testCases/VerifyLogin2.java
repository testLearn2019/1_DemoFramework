package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Reusables.Reusable1;
import pages.Login2;

public class VerifyLogin2 {

	WebDriver driver;
	Reusable1 reuse= new Reusable1();
	Login2 login;
	
	@BeforeTest
	public void browserSetup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\OneDrive\\Documents\\Harika\\Maventest\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(reuse.readProperties("appURL"));
		System.out.println(reuse.readProperties("appURL"));
	}
	
	@Test
	public void verifyValidLogin() {
		login = new Login2(driver);
		login.loginPage();
	}	

}
