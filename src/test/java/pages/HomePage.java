package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "logo-area")
    public WebElement logo;

    public void logoIsDisplayed() {
        if (logo.isDisplayed()) {
            System.out.println("Successfully navigated to login page");
        }
        else {
            System.out.println("Assertion failed!");
        }
    }
}
