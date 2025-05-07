package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends PageBase {
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "customer.firstName")
    public WebElement firstNameBox;

    @FindBy (id= "customer.lastName")
    WebElement lastNameBox;

    @FindBy (id = "customer.address.street")
    WebElement addressBox;

    @FindBy (id = "customer.address.city")
    WebElement cityBox;

    @FindBy (id= "customer.address.state")
    WebElement stateBox;

    @FindBy (id = "customer.address.zipCode")
    WebElement zipCodeBox;

    @FindBy (id = "customer.phoneNumber")
    WebElement phoneNumberBox;

    @FindBy (id = "customer.ssn")
    WebElement ssnBox;

    @FindBy (id="customer.username")
    public WebElement newUsernameBox;


    @FindBy (id = "customer.password")
    public WebElement newPasswordBox;


    @FindBy (id= "repeatedPassword")
    WebElement confirmPasswordBox;

    @FindBy (css = "input[value='Register']")
    WebElement registerBtn ;

    @FindBy (xpath = "//h1[normalize-space()='Welcome tt']")
    public WebElement registrationAssert;



    public void newRegister (String firstNameInput ,String lastNameInput,String addressInput,
                             String cityInput,String stateInput,String zipCodeInput,String phoneNumberInput,String ssnInput,
                             String newUsernameInput,String newPasswordInput) {


        setTextElement(firstNameBox,firstNameInput);
        setTextElement(lastNameBox,lastNameInput);
        setTextElement(addressBox,addressInput);
        setTextElement(cityBox,cityInput);
        setTextElement(stateBox,stateInput);
        setTextElement(zipCodeBox,zipCodeInput);
        setTextElement(phoneNumberBox,phoneNumberInput);
        setTextElement(ssnBox,ssnInput);
        setTextElement(newUsernameBox,newUsernameInput);
        setTextElement(newPasswordBox,newPasswordInput);
        setTextElement(confirmPasswordBox,newPasswordInput);
        clickBtn(registerBtn);

    }


}
