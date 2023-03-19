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
 // import from io.cucumber.java not from junit
    // @Before (order = 0) // order ile aynı tür metodların sırası spesifikleştirilebilir.
    public void setupScenario() { // Hooksta senaryo gerçekleşmeden önce olmasını istediğimiz metodu ekleriz. Feature sınıfındaki Background da ise "Given" vb keyword ek
        System.out.println("========Setting up browser using cucumber @Before");
    }

    // @Before ("@login") // sadece @login ile işaretlenmiş senaryoların öncesinde çalışır
    public void setupScenarioForLogins() {
        System.out.println("========this will only apply to scenarios with @login_tag");

    }

    //  @Before ("@db") // sadece @db ile işaretlenmiş senaryoların öncesinde çalışır
    public void setupScenarioForScenarios() {
        System.out.println("========this will only apply to scenarios with @db_tag");
    }

    @After
    public void teardownScenario(Scenario scenario) {


        // scenari.isFailed() --> if scenario fails this method will return TRUE boolean value

        if(scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());

        }

        Driver.closeDriver();

    }


    // @BeforeStep
    public void setupStep () {
        System.out.println("------->applying setup using @BeforeStep");
    }

    //  @AfterStep
    public void afterStep () {
        System.out.println("-------->applying tearDown using @AfterStep");
    }

}
