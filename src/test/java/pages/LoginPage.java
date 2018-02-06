package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "login_username")
    public WebElement username;

    @FindBy(id = "login_login_password")
    public WebElement password;

    @FindBy(id = "login_submit")
    public WebElement login;

    public void enterUserNameAndPassword(String userName, String passWord) {
        username.sendKeys(userName);
        password.sendKeys(passWord);
    }

    public void clickLogin() {
        login.click();
    }
}
