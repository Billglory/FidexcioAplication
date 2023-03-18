package fidexio.utilities;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;


public class BrowserUtils {

    public static void verifyTitle(String expectedTitle) {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
        wait.until(ExpectedConditions.titleIs(expectedTitle));
        Assert.assertTrue(Driver.getDriver().getTitle().equals(expectedTitle));
    }
}
