package Tests;

import Pages.HomeAfterLoginPage;
import Pages.HomeBeforeLoginPage;
import Pages.OpenNewAccPage;
import Pages.RegistrationPage;
import org.testng.annotations.Test;

public class OpenNewAccTest extends TestBase{
    HomeBeforeLoginPage homeObject;
    RegistrationPage registerObject;
    HomeAfterLoginPage homeAfterObject;
    OpenNewAccPage newAccObject;

    @Test
    public void openNewAccount () throws InterruptedException {
        homeAfterObject = new HomeAfterLoginPage(driver);
        newAccObject = new OpenNewAccPage(driver);

        homeAfterObject.openNewAcc();
        newAccObject.selectAccountType("SAVINGS");
        newAccObject.openAcc();
    }

}
