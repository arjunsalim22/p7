package Test;

import org.testng.annotations.Test;


import Page.Cartpage;

public class Carttest extends Product2test{
	@Test(priority=5)
	public void testing4() throws InterruptedException {
	Cartpage ob=new Cartpage(driver);
	Thread.sleep(4000);
	ob.bikeacc();
	Thread.sleep(4000);
	ob.bikemantain();
	Thread.sleep(4000);
	ob.sortby();
	Thread.sleep(4000);
	ob.spray();
	Thread.sleep(4000);
	ob.add();
	Thread.sleep(4000);
	ob.remove();
	Thread.sleep(4000);

}
}
