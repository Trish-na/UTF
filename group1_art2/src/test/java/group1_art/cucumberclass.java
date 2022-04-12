package group1_art;

import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cucumberclass {
  @Test
  public void f() {
  }
  
  @Given("lofin")
  public void open_the_login_page() {
	  System.out.println("open the login page for cucumber framework");
      // Write code here that turns the phrase above into concrete actions
      throw new io.cucumber.java.PendingException();
  }

  @Given("credentials")
  public void enter_username_and_password() {
	  System.out.println("Enter the username and password for cucumber framework");
      // Write code here that turns the phrase above into concrete actions
      throw new io.cucumber.java.PendingException();
  }

  @When("successful")
  public void login_is_successful() {
	  System.out.println("Login successful for cucumber framework");
      // Write code here that turns the phrase above into concrete actions
      throw new io.cucumber.java.PendingException();
  }

  @Then("order")
  public void order_your_product() {
	  System.out.println("Order your product in cucmber framework");
      // Write code here that turns the phrase above into concrete actions
      throw new io.cucumber.java.PendingException();
  }

  @Then("logout")
  public void logout() {
	  System.out.println("Logout is successful in cucmber framework");
      // Write code here that turns the phrase above into concrete actions
      throw new io.cucumber.java.PendingException();
  }
}
