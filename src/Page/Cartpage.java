package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Cartpage {
	WebDriver driver;
	By obike=By.xpath("//*[@id=\"SiteNav\"]/li[3]/button/span");
	By obikemaintain=By.xpath("//*[@id=\"SiteNavLabel-bike-accessories\"]/ul/li[6]/a/span");
	By osortby=By.xpath("//*[@id=\"SortBy\"]");
	By ospray=By.xpath("//*[@id=\"Collection\"]/ul/li[10]/div/a");
	By oadd=By.xpath("//*[@id=\"product_form_3802788593716\"]/div[2]/button");
	By oremove=By.xpath("//*[@id=\"shopify-section-cart-template\"]/div/form/table/tbody/tr[1]/td[2]/p/a");
	


	public Cartpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
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
	public void add()
	{
		driver.findElement(oadd).click();
	}
	public void remove()
	{
		driver.findElement(oremove).click();
	}

}
