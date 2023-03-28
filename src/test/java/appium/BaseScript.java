package appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseScript extends HelperClass{
    public static AndroidDriver driver;
    public AppiumDriverLocalService service;
    @BeforeClass
    public void setup() throws MalformedURLException {
         service = new AppiumServiceBuilder().
                withAppiumJS(new File("C://Users//Amit//AppData//Roaming//npm//node_modules//appium//build//lib//main.js")).
                withIPAddress("127.0.0.1").
                usingPort(4723).
                build();
        service.start();

        URL url = new URL("http://127.0.0.1:4723");
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("samsung SM-215F");
        options.setApp("C://Users//Amit//Desktop//appium//src//test//java//resources//ApiDemos-debug.apk");

        driver  = new AndroidDriver(url, options);
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
        service.stop();
    }
}
