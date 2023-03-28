package appium;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumBasic extends BaseScript{
    By preference = AppiumBy.accessibilityId("Preference");
    By preferenceDependencies = AppiumBy.accessibilityId("3. Preference dependencies");
    By wifiButton = AppiumBy.xpath("//*[@resource-id='android:id/checkbox']");
    By wifiSetting = AppiumBy.xpath("//*[@resource-id='android:id/title']");
    By wifiName = AppiumBy.xpath("//*[@id='android:id/edit']");
    By okButton = AppiumBy.xpath("//*[@id='android:id/button1']");
    @Test
    public void NativeAppAndroid() throws MalformedURLException, InterruptedException {
        click(preference);
        click(preferenceDependencies);
        click(wifiButton);
        click(wifiSetting);
        Thread.sleep(5000);
        sendKeys(wifiName, "Hello");
        click(okButton);
    }
}