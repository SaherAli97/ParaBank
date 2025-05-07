package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class OpenNewAccPage extends PageBase{
    public OpenNewAccPage(WebDriver driver) {
        super(driver);
    }


    @FindBy (xpath = "//select[@id='type']")
    public WebElement accDropDownList;
    public void accList () {
        clickBtn(accDropDownList);
    }

    public void selectAccountType(String accountType) throws InterruptedException {
        Select select = new Select(accDropDownList);
        select.selectByVisibleText(accountType);

        Thread.sleep(5000);
    }

    @FindBy (xpath = "//input[@value='Open New Account']")
    public WebElement openAccBtn;
    public void openAcc () {
        clickBtn(openAccBtn);
    }



























}
