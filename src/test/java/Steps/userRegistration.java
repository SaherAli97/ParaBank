package Steps;

import Pages.HomeAfterLoginPage;
import Pages.HomeBeforeLoginPage;
import Pages.RegistrationPage;
import Tests.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class userRegistration extends TestBase {

    HomeBeforeLoginPage homeBeforeObject;
    RegistrationPage registerObject;
    HomeAfterLoginPage homeAfterObject;

    @Given("The user in home page")
    public void the_user_in_home_page() {
        homeBeforeObject = new HomeBeforeLoginPage(driver);
        homeBeforeObject.openRegisterPage();
        homeAfterObject = new HomeAfterLoginPage(driver);


    }

    @When("I click on register link")
    public void i_click_on_register_link() {
        Assert.assertTrue(driver.getCurrentUrl().contains("register"));

    }

    @When("I entered the user data")
    public void i_entered_the_user_data() {
        registerObject = new RegistrationPage(driver);
        registerObject.newRegister("Saher","Ali","123 address",
                "city","state","123456","01234567",
                "123","saheralii","123456");


    }

    @Then("The registration page displayed successfully")
    public void the_registration_page_displayed_successfully() {
        homeAfterObject.logout();


    }

}


