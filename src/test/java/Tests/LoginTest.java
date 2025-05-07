package Tests;

import Pages.HomeAfterLoginPage;
import Pages.HomeBeforeLoginPage;
import Pages.RegistrationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{
    HomeBeforeLoginPage homeObject;
    HomeAfterLoginPage homeAfterObject;
    RegistrationPage registerObject;


    @Test
    public void userLoginSuccessfully () {
        homeObject = new HomeBeforeLoginPage(driver);
        registerObject = new RegistrationPage(driver);
        homeAfterObject = new HomeAfterLoginPage(driver);
        homeObject.userLogin("test13","123123");

        try {
            Assert.assertTrue(homeAfterObject.welcomeMessage.isDisplayed());
            System.out.println("Assertion Passed: User logged in Successfully .");
        }
        catch (AssertionError e) {
            System.out.println("Assertion Failed: User didn't login.");
            throw e; // rethrow so the test still fails
        }

    }



}
