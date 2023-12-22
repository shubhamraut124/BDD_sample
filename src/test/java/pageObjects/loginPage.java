package pageObjects;
import fileReader.fileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import stepDefinations.loginPageStepDef;

import java.io.IOException;
public class loginPage {
   public WebDriver driver;


    @FindBy(how=How.XPATH, using= "//input[@id='user-name']")
     WebElement loginUserName;

    @FindBy(xpath = "//input[@id='password']")
     WebElement loginPassword;

    @FindBy(xpath = "//input[@id='login-button']")
     WebElement submitButton;

    @FindBy(xpath = "//div[@class='app_logo']")
    WebElement validLandingPage;


    public loginPage(WebDriver driver) throws IOException, InterruptedException {
        this.driver=driver;
        PageFactory.initElements( driver, this);

    }


    public void landingPage() throws IOException, InterruptedException {
        String tempVar = fileReader.fileReader1("appURL");

        driver.get(tempVar);
        driver.manage().window().maximize();
        Thread.sleep(3000);



    }
public void passUserNamePwd() throws IOException, InterruptedException  {
    String userNameValue=fileReader.fileReader1("stdUserName");
    String passWordValue=fileReader.fileReader1("password");

        loginUserName.sendKeys(userNameValue);
        loginPassword.sendKeys(passWordValue);

    }


    public void clickSUbmit(){

        submitButton.click();
    }
    public  void validateThePage(){
        String pageName =validLandingPage.getText();
        Assert.assertEquals(pageName,"Swag Labs");
    }
}