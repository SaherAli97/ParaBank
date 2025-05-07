package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeAfterLoginPage extends PageBase {
    public HomeAfterLoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (css = ".smallText")
    public WebElement welcomeMessage;

    @FindBy (xpath = "//a[normalize-space()='Log Out']")
    WebElement logoutBtn ;
    public void logout () {
        clickBtn(logoutBtn);
    }







}
