package ScreenShot;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.openqa.selenium.*;
import stepDefinations.BaseClass;

import java.io.File;
import java.io.IOException;


public class ScreenShot extends BaseClass
{
    public ScreenShot() throws IOException, InterruptedException {

    }

    @After(order =1)
public void before_after(Scenario scenario) {
    if (scenario.isFailed()) {



            System.out.println();
            System.out.println("Enter the screenshot class**************");
            TakesScreenshot tkscrnshot = (TakesScreenshot) driver;
            byte[] srnshot = tkscrnshot.getScreenshotAs(OutputType.BYTES);
            scenario.attach(srnshot, "image/png", "scenaioshot");

        }


    }
    @After(order = 0)
    public void tearDown(){
        driver.quit();

    }

}

