package selenium.parent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBaseClass {

	public WebDriver getChromeDriver() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver chromeDriver = new ChromeDriver();
		return chromeDriver;
	}

	public WebDriver getfirefoxDriver() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver firefoxDriver = new FirefoxDriver();
		return firefoxDriver;
	}

	public WebDriver getSafariDriver() {
		WebDriver safariDriver = new SafariDriver();
		return safariDriver;
	}

}
