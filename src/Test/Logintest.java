package Test;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;


import Page.Loginpage;

public class Logintest {
WebDriver driver;
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		driver= new ChromeDriver();
		driver.get("https://www.bikenwear.com/");
		driver.manage().window().maximize();
	}
	@Test(priority=1)
	public void login() throws InterruptedException {
		Loginpage ob=new Loginpage(driver);
		Thread.sleep(4000);
		ob.sign();
		Thread.sleep(4000);
		ob.setvalues("arjunpsalim22@gmail.com", "Arjunsalim@1234");
		Thread.sleep(4000);
		ob.clickbtn();
		Thread.sleep(4000);
		ob.home();
		Thread.sleep(4000);
	}

}
