package Runners;

import Tests.TestBase;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/Feature"
        ,glue = {"Steps"}
        ,plugin = {"pretty","html:target/cucumber-html-report"})
public class TestRunner extends TestBase  {

}
