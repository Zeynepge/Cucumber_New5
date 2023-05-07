package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest", // hangi senaryolarda bu etiket varsa onlar çalıştırılacak
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        //plugin= {"html:target/site/cucumber-pretty.html"}
        // plugin normalde yok, jenkins icin ekliyoruz
        plugin = {"json:target/cucumber/cucumber.json"} // Jenkins için JSON report


)
public class _04_TestRunnerSmoke extends AbstractTestNGCucumberTests {
}
