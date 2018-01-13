package scenarios;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.homePage;
import pages.sourcePage;
import utils.Csv;

public class sc_002 {

	public static WebDriver driver;
//	public static void main(String[] args) throws IOException {
//		public void scExecute() throws Exception{
	public void executeScript() throws IOException {
		// TODO Auto-generated method stub
		Csv csv = new Csv();
		csv.csvFile("sc_002.txt");
		System.setProperty("webdriver.chrome.driver", "E:/TestProject/softwares/chromedriver.exe");
		driver = new ChromeDriver();
		homePage home = new homePage(driver);
		home.openWebsite("http://www.redbus.in/");
		 home.setFrom();
		 home.setTo();
//		 src.selectSource("AKIVEEDU");
		 driver.quit();
		 csv.close();
	}

}
