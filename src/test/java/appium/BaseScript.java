package appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseScript extends HelperClass{
    public AndroidDriver driver;
    public void setup() throws MalformedURLException {
//        AppiumDriverLocalService service = new AppiumServiceBuilder().
//                withAppiumJS(new File("C://Users//Amit//AppData//Roaming//npm//node_modules//appium//build//lib//main.js")).
//                withIPAddress("127.0.0.1").
//                usingPort(4723).
//                build();
//        service.start();
// Use the above code when you want to run the server everytime automatically.

        URL url = new URL("http://127.0.0.1:4723");
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("samsung SM-215F");
        options.setApp("C://Users//Amit//Desktop//appium//src//test//java//resources//ApiDemos-debug.apk");

        driver  = new AndroidDriver(url, options);
    }

    public void tearDown(){
        driver.quit();
    }
}
