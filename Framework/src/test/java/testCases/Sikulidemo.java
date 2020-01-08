package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;


public class Sikulidemo {
	
	WebDriver driver;
	
	@Test
	public void fbLogin() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\OneDrive\\Documents\\Harika\\Maventest\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Screen s = new Screen();
		Pattern adfile = new Pattern ("C:\\Users\\user\\OneDrive\\Documents\\Harika\\Framework\\Sikuli\\Capture.PNG");
		
		try {
			s.click(adfile);
			s.text();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
