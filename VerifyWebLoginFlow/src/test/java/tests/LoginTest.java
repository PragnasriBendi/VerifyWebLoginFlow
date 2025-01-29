package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.ConfigReader;

public class LoginTest extends BaseTest {
	
	private LoginPage loginPage;
    private ConfigReader configReader;

    @BeforeMethod
    public void setUpTest() {
        setup();
        loginPage = new LoginPage(driver);
        configReader = new ConfigReader();
    }

    @Test
    public void testLoginFlow() {
        String url = configReader.getProperty("url");
        String username = configReader.getProperty("username");
        String password = configReader.getProperty("password");

        loginPage.navigateToLoginPage(url);
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();

        Assert.assertTrue(loginPage.isDashboardDisplayed(), "Dashboard is not displayed. Login failed!");
    }

    @AfterMethod
    public void tearDownTest() {
        teardown();
    }

}
