package org.appium.first;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class UtilityClassForCreateDriver {
    public static void main(String[] args) {


    }

    public static AppiumDriver initializeDriver(String platformName) throws Exception {
        DesiredCapabilities caps =new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
        caps.setCapability("newCommandTimeout", 300);

        URL url = new URL("http://0.0.0.0:4723");

        switch (platformName){
            case  "Android":
                caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_2");
                caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
                String appUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
                        + File.separator + "resources" + File.separator + "ApiDemos-debug.apk";
                //caps.setCapability(MobileCapabilityType.APP, appUrl);
                caps.setCapability("appPackage", "io.appium.android.apis");
                caps.setCapability("appActivity", ".ApiDemos");
                return new AndroidDriver(url,caps);
            case "İOS":
                caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 14");
                caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
                caps.setCapability(MobileCapabilityType.UDID, "56AC0DD0-82B6-4EDA-9FF2-B0C44A3268D6");
                String İOSAppurl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
                        + File.separator + "resources" + File.separator + "UIKitCatalog-iphonesimulator.app";
                //caps.setCapability(MobileCapabilityType.APP, appUrl);
                caps.setCapability("simulatorStartupTimeout", "180000");
                caps.setCapability("bundleId", "com.example.apple-samplecode.UICatalog");
                return new IOSDriver(url,caps);
            default:
                throw new Exception("incalid platform");

        }
    }
}
