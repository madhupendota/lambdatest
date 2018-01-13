package scenarios;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.homePage;
import pages.sourcePage;
import utils.Csv;

public class sc_001 {
	
	public static WebDriver driver;
//	public static void main(String[] args) throws IOException {
	 public void executeScript() throws IOException {
		// TODO Auto-generated method stub
		Csv csv = new Csv();
//		String s = this.getClass().getName();
		csv.csvFile("sc_001.txt");
		System.setProperty("webdriver.chrome.driver", "E:/TestProject/softwares/chromedriver.exe");	 
		 driver = new ChromeDriver();
			 homePage home = new homePage(driver);
			 sourcePage src = new sourcePage(driver);
			 home.openWebsite("https://www.facebook.com/");
			 home.setLatName();
			 home.setMobile();
			 home.setLatName();
			 driver.quit();
			 csv.close();
			 
	}

}
