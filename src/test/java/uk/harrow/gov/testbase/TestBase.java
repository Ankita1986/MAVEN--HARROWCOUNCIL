package uk.harrow.gov.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.harrow.gov.basepage.BasePage;
import uk.harrow.gov.browserselector.BrowserSelector;

import java.util.concurrent.TimeUnit;

/**
 * Created by Ankita
 */
public class TestBase extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();
    String baseUrl = "https://www.harrow.gov.uk//";

    @BeforeMethod
    public void openBrowser() {

        browserSelector.selectorBrowser("chrome");
        driver.manage().window().maximize();
        //driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();

    }
}
