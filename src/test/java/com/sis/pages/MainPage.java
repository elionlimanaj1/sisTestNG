package com.sis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sis.testbase.BaseClass;

public class MainPage extends BaseClass {

	@FindBy(id = "Header1_lblSchoolName")
	public WebElement header;

	public MainPage() {
		PageFactory.initElements(driver, this);
	}
}