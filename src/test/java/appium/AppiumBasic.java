package appium;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumBasic extends BaseScript{
    @Test
    public void NativeAppAndroid() throws MalformedURLException {

        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        driver.findElement(AppiumBy.accessibilityId("1. Preferences from XML")).click();
        driver.quit();
//        service.stop();
    }
}