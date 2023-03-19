package fidexio.step_definitions;



import fidexio.utilities.Driver;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.yaml.snakeyaml.events.ScalarEvent;

public class Hooks {
 @After
    public void tearDown(Scenario scenario) {

        byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenShot, "image/png", scenario.getName());

        Driver.closeDriver();
    }

}
