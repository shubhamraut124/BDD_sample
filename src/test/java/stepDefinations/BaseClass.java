package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.loginPage;

import java.io.IOException;

public class BaseClass {


        public WebDriver driver=new ChromeDriver();
         loginPage lg=new loginPage(driver);



    public BaseClass() throws IOException, InterruptedException {
    }


    public  void UserOnlandingPage() throws IOException {
            // Write code here that turns the phrase above into concrete actions
            try {
                lg.landingPage();
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


        public void userUserNamePwd() throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            lg.passUserNamePwd();
        }


        public void clicksloginButton() {
            // Write code here that turns the phrase above into concrete actions
            lg.clickSUbmit();

        }


        public void user_should_land_on_home_page() {
            lg.validateThePage();
            // Write code here that turns the phrase above into concrete actions

        }

    }


