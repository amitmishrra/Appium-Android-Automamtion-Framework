package appium;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.net.MalformedURLException;

public class AppiumBasic extends BaseScript{
    By preference = AppiumBy.accessibilityId("Preference");
    By preferenceDependencies = AppiumBy.accessibilityId("3. Preference dependencies");
    By wifiButton = AppiumBy.xpath("//*[@resource-id='android:id/checkbox']");
    By wifiSetting = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView");
    By wifiName = AppiumBy.id("android:id/edit");
    By okButton = AppiumBy.id("android:id/button1");
    @Test
    public void NativeAppAndroid() throws MalformedURLException, InterruptedException {
        click(preference);
        click(preferenceDependencies);
        click(wifiButton);
        Assert.assertTrue(elementIsVisible(wifiButton));
        click(wifiSetting);
        Thread.sleep(5000);
        sendKeys(wifiName, "Hello");
        click(okButton);
        pressBackButton(2);
    }
}