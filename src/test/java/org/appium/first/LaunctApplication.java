package org.appium.first;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class LaunctApplication {
    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability("avd", "Pixel_2");
       caps.setCapability("avdLaunchTimeout","180000");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_2");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        String appUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
                + File.separator + "resources" + File.separator + "ApiDemos-debug.apk";
        caps.setCapability(MobileCapabilityType.APP, appUrl);
        caps.setCapability("appPackage", "com.saucelabs.mydemoapp.rn");
        caps.setCapability("appActivity", ".MainActivity");


        URL url = new URL("http://0.0.0.0:4723");

        AppiumDriver driver = new AndroidDriver(url, caps);
    }

}
