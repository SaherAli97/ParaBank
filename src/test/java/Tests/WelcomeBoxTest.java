package Tests;

import Pages.HomeBeforeLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WelcomeBoxTest extends TestBase{
    HomeBeforeLoginPage homeObject;

    @Test (priority = 1)
    public void openAboutUs () {
        homeObject = new HomeBeforeLoginPage(driver);
        homeObject.openAboutUs();
        Assert.assertTrue(homeObject.aboutUsAssertion.isDisplayed());
        System.out.println("Assertion Passed: About us page open successfully .");
    }


    @Test (priority = 2)
    public void openCustomerCare () {
        homeObject = new HomeBeforeLoginPage(driver);
        homeObject.openCustomerCare();
        Assert.assertTrue(homeObject.customerCareAssertion.isDisplayed());
        System.out.println("Assertion Passed: Customer Care Page open Successfully .");
    }

    @Test (priority = 3)
    public void openHome () {
        homeObject = new HomeBeforeLoginPage(driver);
        homeObject.openHome();
        System.out.println("Assertion Passed: User returned to home page Successfully .");
    }


}
