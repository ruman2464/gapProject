package com.gap.test;

import org.junit.Test;

import com.gap.pages.HomePage;
import com.gap.pages.JacketPage;

import SeleniumHelper.Shared;

public class SmokeTest extends BaseTest{
	JacketPage jacketPage;
	Shared shared;
	@Test
public void gapTest() {
	HomePage homepage= new HomePage(driver);
	new Shared(driver);
	homepage.verifyGapTitle();
	homepage.isLogoPresent();
	homepage.clickOnPopUp();
	jacketPage=homepage.typeOnSearchBar();
	//jacketPage.clickOnjacket();
	
	
	
}
}
