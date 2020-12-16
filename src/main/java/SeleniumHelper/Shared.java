package SeleniumHelper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Shared {
	
	 static WebDriver driver;
	
 public Shared(WebDriver driver){
		Shared.driver=driver;
	}
	
	public static Properties readPropertiesFIle(String path) throws IOException {
		FileInputStream file = new FileInputStream(new File(path));
	Properties prop = new Properties();
	prop.load(file);
	return prop;
	}
	
	
	public static  boolean verify(WebElement ele) {
		boolean display =ele.isDisplayed();
	return display;
	}
	
	public static  void clickOnAnyElement(WebElement ele) {
	ele.click();
	}
	public static String printTitle() {
		  String title = driver.getTitle();
	return title ;

	}
	public static void typeOnAnyElement(WebElement ele,String value) {
		ele.sendKeys(value);
	}
	public static void listOfWebelement(List<WebElement>ele,int index) {
	ele.get(index).click();
		
		
	}
	
	public void hooverOver(WebElement ele) {
		Actions action = new Actions (driver);
		action.moveToElement(ele).build().perform();
	}
	

}
