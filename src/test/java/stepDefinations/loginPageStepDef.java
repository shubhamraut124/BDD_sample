package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjects.loginPage;

import java.io.IOException;


public class loginPageStepDef {

	 WebDriver driver=new ChromeDriver();
	loginPage lg=new loginPage(driver);

	public loginPageStepDef() throws IOException, InterruptedException {
	}


	@Given("User is on login page")
	public void user_is_on_login_page() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		try {
			lg.landingPage();
		} catch (IOException e) {
			throw new RuntimeException(e);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

	@When("User enters valid user name and password")
	public void user_enters_valid_user_name_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
lg.passUserNamePwd();
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    lg.clickSUbmit();

	}

	@Then("user should land on home page")
	public void user_should_land_on_home_page() {
		lg.validateThePage();
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
