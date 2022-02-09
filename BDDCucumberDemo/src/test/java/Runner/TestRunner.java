package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features = {"C:\\Users\\AmanShukla\\IdeaProjects\\BDDCucumberDemo\\src\\test\\java\\Featurefile"},
                glue = {"StepDefinations"},
//                dryRun = true,
                monochrome = true,
//                strict = true
                plugin = {"pretty","json:Report/Cucumber.json","junit:Report/XMLReport.xml",
                "html:Report/cucumberReport"}

        )
public class TestRunner {
}
