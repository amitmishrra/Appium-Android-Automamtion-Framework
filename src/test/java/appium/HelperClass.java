package appium;

import org.openqa.selenium.By;

public class HelperClass {
    BaseScript baseScript = new BaseScript();
    public void click(By element){
        baseScript.driver.findElement(element).click();
    }
    public void sendKeys(By element, String value){
        baseScript.driver.findElement(element).sendKeys(value);
    }
}
