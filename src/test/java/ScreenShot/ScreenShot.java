package ScreenShot;

import io.cucumber.java.Scenario;
import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.openqa.selenium.*;

import java.io.File;


public class ScreenShot
{
@After
public void before_after(io.cucumber.java.Scenario scenario){

    WebDriver driver = null;
    if(scenario.isFailed()){
        System.out.println();
        System.out.println("Enter the screenshot class**************");
        TakesScreenshot tkscrnshot=(TakesScreenshot) driver;
        byte[] srnshot= tkscrnshot.getScreenshotAs(OutputType.BYTES);
        scenario.attach(srnshot,"image/png","scenaio Failed");
        
    }
driver.quit();
}
}
