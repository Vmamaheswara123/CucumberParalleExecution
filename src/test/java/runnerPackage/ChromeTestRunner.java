package runnerPackage;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\featurefiles\\Loggin_ChromeSetup.feature", 
glue = {"stepDef"},
monochrome = true,
plugin = {"pretty","html:Report\\html_Report"})

public class ChromeTestRunner {

}

/*
 * @CucumberOptions(features = {"src\\test\\resources\\featurefiles\\Loggin_ChromeSetup.feature", 
							"src\\test\\resources\\featurefiles\\Loggin_Edge.feature", 
							"src\\test\\resources\\featurefiles\\Loggin_firefoxSetup.feature"},
 */
