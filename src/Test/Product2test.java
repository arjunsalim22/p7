package Test;

import org.testng.annotations.Test;

import Page.Product2page;

public class Product2test extends Addtocarttest {
	@Test(priority=4)
	public void testing3() throws InterruptedException {
		
	Product2page ob=new Product2page(driver);
	//Thread.sleep(4000);
	//ob.glove();
	Thread.sleep(4000);
	ob.swipe();
	Thread.sleep(4000);
	ob.back();
	Thread.sleep(4000);
	ob.bikeacc();
	Thread.sleep(4000);
	ob.bikemantain();
	Thread.sleep(4000);
	ob.sortby();
	Thread.sleep(4000);
	ob.spray();

}}