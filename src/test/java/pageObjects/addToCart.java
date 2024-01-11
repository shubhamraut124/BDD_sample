package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class addToCart extends loginPage{

  //  public WebDriver driver;


    @FindBy(how= How.XPATH, using= "//button[@class='btn btn_primary btn_small btn_inventory ' and @id='add-to-cart-sauce-labs-backpack']")
    WebElement addToCartButton;

    @FindBy(how= How.XPATH, using= "//a[@class='shopping_cart_link']")
    WebElement cartIcon;


    @FindBy(how= How.XPATH, using= "//div[@class='cart_item_label']")
    WebElement addedProductInCart;




    public addToCart(WebDriver driver) throws IOException, InterruptedException {
        super(driver);
        this.driver=driver;
        PageFactory.initElements( driver, this);

    }

    public void addProductInCart(){
        Assert.assertTrue(addToCartButton.isEnabled());
        addToCartButton.click();

    }

    public void clickOnCartIcon(){
        cartIcon.click();

    }
    public void checkProdInCart(){

        Assert.assertTrue(addedProductInCart.isDisplayed());
    }





}
