import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources",
        glue = {"StepDefs"},
        publish = true,
        plugin = {"html"}
)

public class TestRunner extends AbstractTestNGCucumberTests {
}