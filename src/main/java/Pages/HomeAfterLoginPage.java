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


//Account Service

    @FindBy (css = "a[href='openaccount.htm']")
    WebElement openNewAccBtn;
    public void openNewAcc () {
        clickBtn(openNewAccBtn);
    }

    @FindBy (css = "a[href='overview.htm']")
    WebElement accOverviewBtn;
    public void accOverview () {
        clickBtn(accOverviewBtn);
    }

    @FindBy (css = "a[href='transfer.htm']")
    WebElement transferBtn;
    public void transfer () {
        clickBtn(transferBtn);
    }

    @FindBy (css = "a[href='billpay.htm']")
    WebElement billPayBtn;
    public void billPay () {
        clickBtn(billPayBtn);
    }

    @FindBy (css="a[href='findtrans.htm']")
    WebElement findTransactionBtn ;
    public void findTransaction () {
        clickBtn(findTransactionBtn);
    }

    @FindBy (css = "a[href='updateprofile.htm']")
    WebElement updateProfileBtn;
    public void updateProfile () {
        clickBtn(updateProfileBtn);
    }

    @FindBy (css="a[href='requestloan.htm']")
    WebElement requestLoanBtn;
    public void requestLoan() {
        clickBtn(requestLoanBtn);
    }

    @FindBy (xpath = "//a[normalize-space()='Log Out']")
    WebElement logoutBtn ;
    public void logout () {
        clickBtn(logoutBtn);
    }











}
