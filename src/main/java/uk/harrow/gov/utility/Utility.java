package uk.harrow.gov.utility;


import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import uk.harrow.gov.basepage.BasePage;

import java.util.Random;


/**
 * Created by Ankita
 */
public class Utility extends BasePage {

    public static String sameEmail;
    public static String samePassword;

    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }


    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }


    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }


    public void selectByIndexForDropDownElement(By by, int index) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);

    }

    public void selectByValueForDropDownElement(By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);

    }

    public void selectByVisibleTextForDropDownElement(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);

    }

    public void mouseHoverToElement(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).perform();
    }

    public void mouseHoverToElementAndClick(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).click().perform();
    }
    //this method need to use when we want to create random email and register in demo site
    public void enterRandomEmail(By by) {
        Random anyEmail = new Random();
        int randomInt = anyEmail.nextInt(1000);
        sameEmail = "Tajmahal" + randomInt + "@gmail.com";
        driver.findElement(by).sendKeys(sameEmail);


    }

    //this method we need to use when we want to use stored email id like above email stored
    public void enterStoredEmailToNextField(By by, String str) {
         str = sameEmail;
        driver.findElement(by).sendKeys(str);

    }

    //this method we need to use when we want to enter random password many time
    public void enterRandomPassword(By by) {
        Random anyPassword = new Random();
        int randomInt = anyPassword.nextInt(1000);
        samePassword = "Tajmahal" + randomInt;
        driver.findElement(by).sendKeys(samePassword);
    }

    //this method we need to use to enter stored password like above password
    public void enterStoredPasswordToNextField(By by, String pass) {
        pass = samePassword;
        driver.findElement(by).sendKeys(pass);

    }

}
