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
//    @Before(order = 2)
//    public static void setupScenario() {
//        System.out.println("setting things @Before");
//    }

    @After
    public void teardownscenario(Scenario scenario) {
        System.out.println("---closing browser @After");

     if (scenario.isFailed()) {
         byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
         scenario.attach(screenshot, "image/png", scenario.getName());
     }
  //   Driver.closeDriver();
    }
//
//    @BeforeStep
//    public void setup() {
//        System.out.println("before step setup @BeforeStep");
//    }

}
