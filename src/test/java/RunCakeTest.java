import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/features", strict = true, tags = {"@login"}, plugin = {"json:target/cucumber.json"})
//@CucumberOptions(features = "src/test/features", strict = true, tags = {"@reg, ~@smoke"}, plugin = {"json:target/cucumber.json"})
public class RunCakeTest {
}

