import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources",
        glue = {"StepDefs"})

public class TestRunner extends AbstractTestNGCucumberTests {
}