package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeBeforeLoginPage extends PageBase {
    public HomeBeforeLoginPage(WebDriver driver) {
        super(driver);
    }

    //Login Box
    @FindBy (css = "input[name='username']")
    WebElement usernameBox;

    @FindBy (css="input[name='password']")
    WebElement passwordBox;

    @FindBy (css = "input[value='Log In']")
    WebElement loginBtn;


    public void userLogin(String username, String password) {
        setTextElement(usernameBox,username);
        setTextElement(passwordBox,password);
        clickBtn(loginBtn);
    }

    //Welcome, Box

    @FindBy (xpath = "//a[normalize-space()='home']")
    WebElement home;

    @FindBy (xpath = "//a[normalize-space()='about']")
    WebElement aboutUs;
    @FindBy (xpath = "//p[contains(text(),'For more information about Parasoft solutions plea')]")
    public WebElement aboutUsAssertion;

    @FindBy (xpath = "//a[normalize-space()='contact']")
    WebElement customerCare;
    @FindBy (xpath = "//h1[normalize-space()='Customer Care']")
    public WebElement customerCareAssertion;

    public void openHome (){
        clickBtn(home);
    }

    public void openAboutUs () {
        clickBtn(aboutUs);
    }

    public void openCustomerCare () {
        clickBtn(customerCare);
    }


    // Register

    @FindBy (linkText = "Register")
    WebElement registerBtn;
    public void openRegisterPage () {
        clickBtn(registerBtn);
    }



























}