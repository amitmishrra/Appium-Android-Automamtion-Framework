package appium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import java.util.logging.Logger;

import static appium.BaseScript.driver;

public class HelperClass {

    public void click(By element) {
        driver.findElement(element).click();
    }

    public void sendKeys(By element, String value) {
        driver.findElement(element).sendKeys(value);
    }

    public void pressBackButton(int clicks) {
        for (int i = 0; i < clicks; i++) {
            driver.navigate().back();
        }
    }

    public boolean isElementVisible(By element) {
        try {
            driver.findElement(element);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
public String getText(By element){
        if(isElementVisible(element)){
          return  driver.findElement(element).getText();
        }else{

            return null;
        }
}
}
