package in.reqres.endpoints.executar;


import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber-reports/cucumber.json"},
        features = "src/test/resources/features",
        glue = "in.reqres.endpoints",
        monochrome = true,
        tags="@Login"
)

public class RunCucumberTest extends AbstractTestNGCucumberTests {

    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
