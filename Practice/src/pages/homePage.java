package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utils.actions;
import webdriver.*;

public class homePage{
	public WebDriver driver;
	By oneWay = By.id("ctl00_cpEndUserMain_ucSearchRoute_rbtnList_1");
	By first = By.xpath("//input[@name='firstname']");
	By last = By.xpath("//input[@name='lastname']");
	By mobile = By.xpath("//input[@name='reg_email__']");
	By redbusFrom = By.xpath("//input[@id='src']");
	By redbusTo = By.xpath("//input[@id='dest']");
	actions  actions;
	public homePage(WebDriver driver){
		this.driver = driver;
		actions = new actions(this.driver);
//		PageFactory.initElements(driver, this);
	}
	
	public void openWebsite(String url){
		actions.get(url);
		
	}

	public void oneWay() throws IOException{
		actions.click(oneWay,"One Way");
	}
	public void setFirstName() throws IOException{
		actions.setText(first, "Madhu");
	}
	public void setFrom() throws IOException{
		actions.setText(redbusFrom, "Hyderabad");
	}
	public void setTo() throws IOException{
		actions.setText(redbusTo, "Hanamkonda");
	}
	public void setLatName() throws IOException{
		actions.setText(last, "Pendota");
	}
	public void clearLatName() throws IOException{
		actions.setText(last, "");
	}
	public void setMobile() {
		actions.setTexts(mobile, "9949217044");
	}
}
