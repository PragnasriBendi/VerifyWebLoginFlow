package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	 private WebDriver driver;

	    // Locators
	    private By usernameField = By.id("username");
	    private By passwordField = By.id("password");
	    private By loginButton = By.id("loginButton");
	    private By dashboardElement = By.id("dashboard");

	    // Constructor
	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    // Actions
	    public void navigateToLoginPage(String url) {
	        driver.get(url);
	    }

	    public void enterUsername(String username) {
	        driver.findElement(usernameField).sendKeys(username);
	    }

	    public void enterPassword(String password) {
	        driver.findElement(passwordField).sendKeys(password);
	    }

	    public void clickLoginButton() {
	        driver.findElement(loginButton).click();
	    }

	    public boolean isDashboardDisplayed() {
	        return driver.findElement(dashboardElement).isDisplayed();
	    }

}
