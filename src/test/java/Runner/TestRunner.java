package Runner;

import ScreenShot.ScreenShot;
import org.junit.runner.RunWith;
import io.cucumber.junit.*;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"stepDefinations", "ScreenShot"},
monochrome = true,
plugin = "me.jvt.cucumber.report.PrettyReports:target/cucumber",


tags="@addTocart"

		)
public class TestRunner {

}
