package sample.test;

import java.io.IOException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import sample.logic.Booking;


@Parameters("browser")
public class BookingTest extends Booking{	
  @Test(parameters="browser")
  public void checkWebOrderTest(String browser) throws IOException {
	  setStr(browser);
	  System.out.println(config.keySet());

	/** Assert.assertEquals("EAGLENICE", getText(locator("xpath_WOPartnerName")));*/
  }
  public void WebOrderDetails() {
	// TODO Auto-generated method stub
	
}

public void setStr(String browser) {
	// TODO Auto-generated method stub
	
}

@Test(parameters="browser")
  public void bookOrder(String browser)
  {
	  setStr(browser);
	  /**Assert.assertTrue(assertElementPresent(locator(" xpath_WOConfirmationOK")));*/
  }
}
