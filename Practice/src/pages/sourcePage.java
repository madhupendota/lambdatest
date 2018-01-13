package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.actions;
import webdriver.webdriver;

public class sourcePage{
	public static WebDriver driver;
	By s = By.id("ctl00_cpEndUserMain_ucSearchRoute_ddlSource");
	actions  actions;
	public sourcePage(WebDriver driver){
		this.driver = driver;
		actions = new actions(this.driver);
	}
	public void selectSource(String value) throws IOException{
		actions.selectByVisibleText(s,value);
	}

}
