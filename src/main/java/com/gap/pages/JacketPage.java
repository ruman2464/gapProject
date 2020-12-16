package com.gap.pages;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleniumHelper.Shared;

public class JacketPage {
WebDriver driver;
@FindBy(xpath="//div[@class='product-card-grid__root grid ism-root']/div") WebElement jacketPic;

public JacketPage(WebDriver driver ) {
	this.driver= driver;
	PageFactory.initElements(driver, this);
}
//@SuppressWarnings("unchecked")
//@Test
//public void clickOnjacket() {
//Shared.listOfWebelement(  jacketPic, 1);
//
//}



}
