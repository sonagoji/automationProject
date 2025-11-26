import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="features",glue= {"stepdefinition"},plugin = {"pretty", "html:ReportsFolder/cucumber_reports.html"},monochrome=true)

public class testrunner extends AbstractTestNGCucumberTests{

}
