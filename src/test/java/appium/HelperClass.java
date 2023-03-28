package appium;

import org.openqa.selenium.By;

import static appium.BaseScript.driver;

public class HelperClass {

    public void click(By element){
        driver.findElement(element).click();
    }
    public void sendKeys(By element, String value){
        driver.findElement(element).sendKeys(value);
    }
}
