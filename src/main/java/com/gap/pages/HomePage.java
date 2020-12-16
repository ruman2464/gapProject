package com.gap.pages;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import SeleniumHelper.Shared;

public class HomePage extends LoadableComponent<HomePage>{
	WebDriver driver;
	JacketPage jacketPage;
	
	
	

	@FindBy(xpath = "//img[@class='css-8atqhb']")
	WebElement gapLogo;
	@FindBy(xpath = "//button[@class='css-1qosac6']")
	WebElement popUp;
	@FindBy(xpath = "//input[@type='search']")
	WebElement searchBar;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement searchButton;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//@Test//wrong
	public void verifyGapTitle() {
		String title = Shared.printTitle();
		Assert.assertEquals("Shop Gap for Casual Women's, Men's, Maternity, Baby & Kids Clothes", title);
	}

	//@Test
	public void isLogoPresent() {
		boolean gaplogo = Shared.verify(gapLogo);
		Assert.assertTrue(gaplogo);
	}

	//@Test
	public void clickOnPopUp() {
		Shared.clickOnAnyElement(popUp);
		System.out.println("clicking on pop up");

	}

	//@Test
	public JacketPage typeOnSearchBar() {
		searchBar.sendKeys("jacket");
		searchButton.click();
		return new JacketPage(driver);
	}

	@Override
	protected void load() {
		driver.navigate().to("https://www.gap.com/browse/search.do?searchText=jacket");
		 jacketPage= new JacketPage(driver);
	}

	@Override
	protected void isLoaded() throws Error {
		
		driver.getCurrentUrl().equals("https://www.gap.com/browse/search.do?searchText=jacket");
		 jacketPage = new JacketPage(driver);
	}

}