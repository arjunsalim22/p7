package Test;

import org.testng.annotations.Test;


import Page.Addtoartpage;



public class Addtocarttest extends Producttest {
	@Test(priority=3)
	public void testing2() throws InterruptedException
	{
	Addtoartpage ob=new Addtoartpage(driver);
	Thread.sleep(4000);
	//ob.home();
	Thread.sleep(4000);
	//ob.product();;
	Thread.sleep(4000);
	ob.selectitm();;
	Thread.sleep(4000);
	ob.addtocart();
	Thread.sleep(4000);
	ob.quantity("11");
	Thread.sleep(4000);
	ob.checkout();
	Thread.sleep(4000);
	ob.returntocart();
	Thread.sleep(4000);
	ob.search();
	Thread.sleep(4000);
	ob.search1();
	Thread.sleep(4000);
	ob.glove();
	Thread.sleep(3000);

}

}
