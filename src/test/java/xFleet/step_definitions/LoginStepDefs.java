package xFleet.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import xFleet.pages.LoginPage;
import xFleet.utilities.BrowserUtils;
import xFleet.utilities.ConfigurationReader;
import xFleet.utilities.Driver;

import javax.security.auth.login.Configuration;

public class LoginStepDefs {


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("the user enters the driver information")
    public void the_user_enters_the_driver_information() {
       String username = ConfigurationReader.get("driver_username");
       String password= ConfigurationReader.get("driver_password");

       LoginPage loginPage= new LoginPage();
       loginPage.login(username,password);


    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        BrowserUtils.waitFor(3);
        String actualTitle= Driver.get().getTitle();
        Assert.assertEquals("Dashboard", actualTitle);

    }

    @When("the user enters the sales manager information")
    public void the_user_enters_the_sales_manager_information() {
        String username = ConfigurationReader.get("sales_manager_username");
        String password= ConfigurationReader.get("sales_manager_password");

        LoginPage loginPage= new LoginPage();
        loginPage.login(username,password);
    }

    @When("the user enters the store manager information")
    public void the_user_enters_the_store_manager_information() {
        String username = ConfigurationReader.get("store_manager_username");
        String password= ConfigurationReader.get("store_manager_password");

        LoginPage loginPage= new LoginPage();
        loginPage.login(username,password);
    }

}