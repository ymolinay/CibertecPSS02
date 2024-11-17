package cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * A class that represents the log in page in the Sauce Demo website
 */
public class PaginaLogin extends Pagina {

    // Accessing the web elements from the login page that could be useful for the testers
    private By usernameTextBox = new By.ById("user-name");
    private By passwordTextBox = new By.ById("password");
    private By loginButton = new By.ById("login-button");


    public PaginaLogin(WebDriver webDriver) {
        super(webDriver);
        this.getDriver().get("https://www.saucedemo.com/");
    }

    /**
     * Method for entering a series of string characters in the username text box
     */
    public void ingresarUsername(String username) {
        try {
            this.getDriver().findElement(usernameTextBox).sendKeys(username);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Method for entering a series of string characters in the password text box
     */
    public void ingresarPassword(String password) {
        try {
            this.getDriver().findElement(passwordTextBox).sendKeys(password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Method for clicking the login button in the login page
     */
    public void clickBotonLogin() {
        try {
            this.getDriver().findElement(loginButton).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
