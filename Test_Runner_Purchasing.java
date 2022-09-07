package Cucumber_test;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features= "src/test/java/feature/Functional_test.feature",
        glue="StepDefinition_Purchasing"
)



public class Test_Runner_Purchasing extends AbstractTestNGCucumberTests {
}
