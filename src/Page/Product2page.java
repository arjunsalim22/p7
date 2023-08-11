package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Product2page {
	WebDriver driver;
	By ohome=By.xpath("//*[@id=\"SiteNav\"]/li[1]/a/span");
	By oglove=By.xpath("/html/body/div[3]/main/ul[1]/li[8]/div/a");
	By ogloves=By.xpath("//*[@id=\"ProductSection-product-template\"]/div/div[1]/div[3]/ul/li[2]/a/img");
	By obike=By.xpath("//*[@id=\"SiteNav\"]/li[3]/button/span");
	By obikemaintain=By.xpath("//*[@id=\"SiteNavLabel-bike-accessories\"]/ul/li[6]/a/span");
	By osortby=By.xpath("//*[@id=\"SortBy\"]");
	By ospray=By.xpath("//*[@id=\"Collection\"]/ul/li[10]/div/a");
	
	
	
	public Product2page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void glove()
	{
		WebElement g=driver.findElement(oglove);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", g);
		g.click();
		
	}
	public void swipe()
	{
		WebElement e=driver.findElement(ogloves);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", e);
		e.click();
	}
	public void back()
	{
		driver.navigate().back();
		WebElement h=driver.findElement(ohome);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", h);
		h.click();
		
	}
	public void bikeacc()
	{
		driver.findElement(obike).click();
	}
	public void bikemantain()
	{
		driver.findElement(obikemaintain).click();
	}
	public void sortby()
	{
		WebElement r=driver.findElement(osortby);
		Select l=new Select(r);
		l.selectByIndex(4);
	}
	public void spray()
	{
		WebElement j=driver.findElement(ospray);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", j);
		j.click();
		
	}

}

