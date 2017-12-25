package pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class pn_dk_sc45 {

	WebDriver driver = new ChromeDriver();
	@Test
	public void launcFB(){
		driver.get("https://www.facebook.com/");
		System.out.println("Launched Facebook");
		
	}
	@Test
	public void launcGoogle(){
		driver.get("https://www.Google.com/");
		System.out.println("Launched Google");
		
	}
	@Test
	public void launchYoutube(){
		driver.get("https://www.Youtube.com/");
		System.out.println("Launched Youtube");
		
	}
	
}
