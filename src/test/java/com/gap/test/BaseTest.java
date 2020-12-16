package com.gap.test;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import SeleniumHelper.Shared;

public class BaseTest {
	public static Properties prop;
	public static WebDriver driver;
@BeforeClass
	public static void configPropertiesFile() throws IOException {
		prop = Shared.readPropertiesFIle("/Users/mdgulamkibria/Desktop/bit tech/GapProject/congig.properties");

	}
@Before
	public void openBrowser() {
		String brows = prop.getProperty("browser");
		if (brows.equals("FirefoxDriver")) {
			System.setProperty("webdriver.gecko.driver", "/Users/mdgulamkibria/Downloads/geckodriver");
			driver = new FirefoxDriver();

		} else if (brows.equals("ChromeDriver")) {
			driver = new ChromeDriver();
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver .manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	

	}
@AfterClass
public static void closeBrowser() {
	driver.quit();
}




}
