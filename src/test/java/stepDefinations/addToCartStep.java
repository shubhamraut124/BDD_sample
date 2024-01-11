package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageObjects.addToCart;
import pageObjects.loginPage;

import java.io.IOException;

import static stepDefinations.BaseClass.*;

public class addToCartStep extends BaseClass{

  //  WebDriver driver=new ChromeDriver();
    //loginPage lg=new loginPage(driver);
    addToCart add =new addToCart(driver);


    public addToCartStep() throws IOException, InterruptedException {
    }


    @Given("user is on landing page")
    public void userIsOnLandingPage() throws Throwable {
        UserOnlandingPage();
        userUserNamePwd();
        clicksloginButton();

    }
    @When("user clicks on add to cart")
    public void userClicksOnAddToCart() {
        add.addProductInCart();
    }

    @Then("prodcut shohuld be added in cart")
    public void prodcutShohuldBeAddedInCart() {
    }


    @And("check whether product is added in cart")
    public void checkWhetherProductIsAddedInCart() {
    add.clickOnCartIcon();
    add.checkProdInCart();
    }
}
