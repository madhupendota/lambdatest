package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;


public class dummy {

	
	
	public static void main(String[] args){
		WebDriver driver;
//		DesiredCapabilities dcap = DesiredCapabilities.chrome();
//		driver = new RemoteWebDriver(dcap);
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
//		String text = driver.findElement(By.xpath("//div[contains(@class,'lfloat _ohe')]/h1//u")).getText();
//		WebElement e = driver.findElement(By.xpath("//div[contains(@class,'lfloat _ohe')]/h1//u"));
//		System.out.println(text);
//		Assert.assertTrue(e.isDisplayed());
//		Assert.assertNotEquals(text, "facebook");
//		Assert.assertEquals(text, "Facebook");
		driver.quit();
	}
}
