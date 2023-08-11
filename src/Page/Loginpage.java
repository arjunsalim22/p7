package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	WebDriver driver;
	By osettings=By.xpath("//*[@id=\"shopify-section-header\"]/div/header/div/div[2]/div/a[1]");
	By oemail=By.xpath("//*[@id=\"CustomerEmail\"]");
	By opass=By.xpath("//*[@id=\"CustomerPassword\"]");
	By osigin=By.xpath("//*[@id=\"customer_login\"]/div/input");
	By ohome=By.xpath("//*[@id=\"SiteNav\"]/li[1]/a/span");
	public Loginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;	}
	public void sign()
	{
		driver.findElement(osettings).click();
		
	}

	public void setvalues(String email, String pass)
	{
		driver.findElement(oemail).sendKeys(email);
		driver.findElement(opass).sendKeys(pass);
	}
	public void clickbtn()
	{
		driver.findElement(osigin).click();
	}
	public void home()
	{
		driver.findElement(ohome).click();
	}

}



