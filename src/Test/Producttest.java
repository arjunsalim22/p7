package Test;

import org.testng.annotations.Test;


import Page.Productpage;

public class Producttest extends Logintest{

	@Test(priority=2)
	public void testing() throws InterruptedException
	{
		Productpage ob=new Productpage(driver);
		Thread.sleep(4000);
		ob.home();
		Thread.sleep(4000);
		ob.product();
		Thread.sleep(4000);
	
		
	}

}
