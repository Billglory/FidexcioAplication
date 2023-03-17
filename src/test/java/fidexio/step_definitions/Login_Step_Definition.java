package fidexio.step_definitions;

import fidexio.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import fidexio.pages.LoginPage;
import fidexio.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Login_Step_Definition {

    LoginPage loginPage = new LoginPage();

@Given("user goes to login page")
public void user_goes_to_login_page() {
   Driver.getDriver().get(ConfigurationReader.getProperty("loginUrl"));


    System.out.println("user goes to login page");
}

    @When("{string} enter username {string} and password {string}")
    public void enter_username_and_password(String string, String userName, String password) {
   loginPage.inputEmail.sendKeys(userName);
        loginPage.inputPassword.sendKeys(password);

 System.out.println("User enters username");
}

    @Then("user enters password")
    public void user_enters_password(String password) {
        loginPage.inputPassword.sendKeys(password);
        System.out.println("User enters password");
    }


 @When("user click on login button")
    public void user_click_on_login_button() {

     String value = loginPage.inputEmail.getAttribute("required");
     loginPage.loginButton.click();
 }

@Then("user  clicks login button")
public void user_clicks_login_button() {
System.out.println("user  clicks login button");
}

@Then("user logged in")
public void user_logged_in(io.cucumber.datatable.DataTable dataTable) {
System.out.println("user logged in");
}


    @And("user enters invalid <password>")
    public void userEntersInvalidPassword() {
    }

    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
    }

    @Then("user should see discuss page ")
    public void userShouldSeeDiscussPage(String arg0) throws Throwable {

    }

    @When("user enters invalid <username>")
    public void userEntersInvalidUsername() {
    }

    @And("user clicks on the log in button")
    public void userClicksOnTheLogInButton() {
    }

    @Then("user cannot login")
    public void userCannotLogin() {
    }

    @When("user enters empty <username>")
    public void user_Enters_Empty_Username() {
    }

    @Then("user should see the error message")
    public void userShouldSeeTheErrorMessage() {
    }

    @When("user enters  <username>")
    public void user_Enters_Username() {
    }

    @And("user enters <password>")
    public void user_Enters_Password() {
    }

    @Then("user should not be able to see the password")
    public void userShouldNotBeAbleToSeeThePassword() {
    }

    @And("user clicks on the enter key")
    public void userClicksOnTheEnterKey() {
    }

    @Then("user logged in the home page")
    public void userLoggedInTheHomePage() {
    }

    @Then("user should see discuss page")
    public void user_Should_See_DiscussPage(String arg0) throws Throwable {

    }

    @When("user enters invalid <username")
    public void user_Enters_Invalid_Username() {
    }

    @When("user enters empty <username")
    public void userEntersEmptyUsername() {
    }

    @When("user enters  <username")
    public void userEntersUsername() {
    }

    @And("user enters <password")
    public void userEntersPassword() {
    }
}
