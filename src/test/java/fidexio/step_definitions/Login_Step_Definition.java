package fidexio.step_definitions;


import fidexio.utilities.BrowserUtils;
import fidexio.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import fidexio.pages.LoginPage;
import fidexio.utilities.Driver;
import io.cucumber.java.en.And;


public class Login_Step_Definition {

    LoginPage loginPage = new LoginPage();

@Given("user goes to login page")
public void user_goes_to_login_page() {
  Driver.getDriver().get(ConfigurationReader.getProperty("env"));


}

    @When("{string} enter username ")
    public void enter_username_and_password(String string, String userName) {
   loginPage.inputUsername.sendKeys(userName);


}

    @Then("user enters password")
    public void user_enters_password(String string, String password) {
        loginPage.inputPassword.sendKeys(password);

    }


 @When("user click on login button")
    public void user_click_on_login_button() {
 loginPage.loginButton.click();
 }

@Then("user  clicks login button")
public void user_clicks_login_button() {

}

@Then("user logged in")
public void user_logged_in(io.cucumber.datatable.DataTable dataTable) {
  BrowserUtils.verifyTitle("#Inbox - Odoo");


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


    @When("^user enters wrong username$")
    public void userEntersWrongUsername() {
    }

    @Then("^user enters wrong password$")
    public void userEntersWrongPassword() {
    }

    @And("^user clicks login button$")
    public void userClicksLoginButton() {
    }

    @Then("^user cannot login warning$")
    public void userCannotLoginWarning() {
    }

    @And("^user enters  <password>$")
    public void user_EntersPassword() {
    }

    @When("user enters  <username>")
    public void user_EntersUsername() {
    }


    @And("user enters <password>")
    public void userEntersPassword() {
    }

    @Then("enters password")
    public void entersPassword() {

    }

    @When("enters username")
    public void entersUsername() {
    }

    @And("clicks login button")
    public void clicksLoginButton() {
    }
}
