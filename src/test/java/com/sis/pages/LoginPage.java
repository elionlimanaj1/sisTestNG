package com.sis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sis.testbase.BaseClass;

public class LoginPage extends BaseClass {

	@FindBy(id = "tUsername")
	public WebElement username;

	@FindBy(id = "tPassword")
	public WebElement password;

	@FindBy(id = "bLogin")
	public WebElement loginButton;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
}