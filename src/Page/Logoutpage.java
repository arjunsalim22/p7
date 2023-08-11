package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logoutpage {
	WebDriver driver;
	By ohome=By.xpath("//*[@id=\"SiteNav\"]/li[1]/a/span");
	By osettings=By.xpath("//*[@id=\"shopify-section-header\"]/div/header/div/div[2]/div/a[1]");
	By oswipe=By.xpath("//*[@id=\"SlideshowWrapper-slideshow\"]/div[2]/div/button[2]");
	By ologout=By.xpath("//*[@id=\"customer_logout_link\"]");
	
	
	

	public Logoutpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public void home()
	{
		driver.findElement(ohome).click();
	}
	
	public void swipee()
	{
		driver.findElement(oswipe).click();
	}
	public void sign()
	{
		driver.findElement(osettings).click();
		
	}
	public void logout()
	{
		driver.findElement(ologout).click();
	}

}
