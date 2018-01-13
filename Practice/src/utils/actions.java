package utils;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class actions {
	public WebDriver driver;
	public WebElement webElement;
	Csv csv = new Csv();
	public actions(WebDriver driver){
		this.driver = driver;
	}
	public void get(String url){
		driver.get(url);
	}
	public void click(By locator, String log) throws IOException{
		webElement = driver.findElement(locator);
		if(webElement.isDisplayed()){
			webElement.click();
			csv.appendText("Perform Click Opration", "Successfully Clicked On "+log, "PASS");
		}else{
			csv.appendText("Perform Click Opration", "Successfully Clicked On "+log, "FAIL");
		}
	}
	public void selectByVisibleText(By locator,String value) throws IOException{
		webElement = driver.findElement(locator);
		if(webElement.isDisplayed()){
			Select src = new Select(driver.findElement(locator));
			src.selectByVisibleText(value);
			csv.appendText("Selet DropDown", "Successfully Selected "+value, "PASS");
		}else{
			csv.appendText("Selet DropDown", "Successfully Selected "+value, "FAIL");
		}
	}
	
	public void setText(By locator,String value){
		webElement = driver.findElement(locator);
		try{
			System.out.println("webElement.isDisplayed() "+webElement.isEnabled());
		if(webElement.isEnabled()){
			webElement.sendKeys(value);
			csv.appendText("SetText", "Successfully Entered "+value, "PASS");
		}else{
			csv.appendText("SetText", "Successfully Not Entered "+value, "FAIL");
		}
		}
		catch(Exception e){
			try {
				csv.appendText("SetText", "Element No Found", "FAIL");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
	}
	public void setTexts(By locator,String value){
		webElement = driver.findElement(locator);
		try{
			System.out.println("webElement.isDisplayed() "+webElement.isEnabled());
		if(webElement.isEnabled()){
			webElement.sendKeys(value);
			csv.appendText("SetText", "Successfully Entered "+value, "FAIL");
		}else{
			csv.appendText("SetText", "Successfully Not Entered "+value, "FAIL");
		}
		}
		catch(Exception e){
			try {
				csv.appendText("SetText", "Element No Found", "FAIL");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
	}
}
