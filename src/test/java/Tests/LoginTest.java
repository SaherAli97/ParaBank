package Tests;

import Pages.HomeBeforeLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{
    HomeBeforeLoginPage homeObject;


    @Test
    public void userLoginSuccessfully () {
        homeObject = new HomeBeforeLoginPage(driver);
        homeObject.userLogin("johnnn","demo");

        try {
            Assert.assertTrue(homeObject.welcomeMessage.isDisplayed());
            System.out.println("Assertion Passed: User logged in Successfully .");
        }
        catch (AssertionError e) {
            System.out.println("Assertion Failed: User didn't login.");
            throw e; // rethrow so the test still fails
        }

    }



}
