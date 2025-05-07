package Tests;

import Pages.HomeAfterLoginPage;
import Pages.HomeBeforeLoginPage;
import Pages.RegistrationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase {

    HomeBeforeLoginPage homeObject;
    RegistrationPage registerObject;
    HomeAfterLoginPage homeAfterObject;

    @Test
    public void registerSuccess () {
        homeObject = new HomeBeforeLoginPage(driver);
        homeAfterObject = new HomeAfterLoginPage(driver);
        homeObject.openRegisterPage();
        registerObject = new RegistrationPage(driver);
        registerObject.newRegister("TestFName","TestLName","address","city","state",
                "123123","0112211221","1212","Test13","123123");

        //Assert.assertTrue(registerObject.registrationAssert.isDisplayed());
        //System.out.println("Assertion Passed: User Registered Successfully .");

        homeAfterObject.logout();





    }
}
