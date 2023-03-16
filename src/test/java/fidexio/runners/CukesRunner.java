package fidexio.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features",
        glue = "fidexio/step_definitions",
        dryRun = false,
        tags = "@FIX10-257"


)
public class CukesRunner {
}

