package Test;

import org.testng.annotations.Test;


import Page.Logoutpage;

public class Logouttest extends Carttest {
	@Test(priority=6)
	public void testing4() throws InterruptedException {
	Logoutpage ob=new Logoutpage(driver);
	ob.home();
	Thread.sleep(4000);
	ob.swipee();
	Thread.sleep(4000);
	ob.sign();
	Thread.sleep(4000);
	ob.logout();

}
}
