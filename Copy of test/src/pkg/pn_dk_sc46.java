package pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class pn_dk_sc46 {

	WebDriver driver = new ChromeDriver();
	@Test
	public void launchPaytm(){
		driver.get("https://paytmmall.com/");
		System.out.println("Launched Paytm");
		
	}
	@Test
	public void launcFlipkart(){
		driver.get("https://www.flipkart.com/");
		System.out.println("Launched flipkart");
		
	}
	@Test
	public void launchAmazon(){
		driver.get("https://www.amazon.in/");
		System.out.println("Launched Amazon");
		
	}
	
}
