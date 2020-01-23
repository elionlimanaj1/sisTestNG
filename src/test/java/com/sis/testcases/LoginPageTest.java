package com.sis.testcases;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sis.pages.LoginPage;
import com.sis.pages.MainPage;
import com.sis.utils.CommonMethods;
import com.sis.utils.ConfigsReader;

public class LoginPageTest extends CommonMethods {

	@Test
	public void loginTest() throws InterruptedException {
		LoginPage loginPage = new LoginPage();
		MainPage mainPage = new MainPage();

		sendText(loginPage.username, ConfigsReader.getProperty("username"));
		sendText(loginPage.password, ConfigsReader.getProperty("password"));
		click(loginPage.loginButton);
		Thread.sleep(1000);

		Assert.assertTrue(mainPage.header.isDisplayed());
	}

	@Test
	public void loginTestNoPassword() {
		LoginPage loginPage = new LoginPage();

		sendText(loginPage.username, ConfigsReader.getProperty("username"));
		click(loginPage.loginButton);

		String expectedText = "Please fill required fields";
		String alertTxt = getAlertText();

		dismissAlert();

		Assert.assertEquals(alertTxt, expectedText, "The text is not the same");
	}

}