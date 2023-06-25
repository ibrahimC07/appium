package org.appium.first;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class CreateBrowserSession {

    public static AppiumDriver initializeDriver(String platformName) throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
   //     caps.setCapability("newCommandTimeout", 300);

        URL url = new URL("http://0.0.0.0:4723");

        switch(platformName){
            case "Android":
                caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2");
                caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
                //       caps.setCapability("avd", "Pixel_3");
                //       caps.setCapability("avdLaunchTimeout", 180000);
                caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
//                caps.setCapability("chromedriverExecutable", "D:\\Software\\Selenium\\chromedriver.exe");
       //         caps.setCapability("chromedriverExecutableDir", "/Users/Om/Downloads/ChromeDriverDir");
                return new AndroidDriver(url, caps);
            case "iOS":
                caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 14");
                caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
                caps.setCapability(MobileCapabilityType.UDID, "56AC0DD0-82B6-4EDA-9FF2-B0C44A3268D6");
                caps.setCapability("simulatorStartupTimeout", 180000);
                caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
                return new IOSDriver(url, caps);
            default:
                throw new Exception("invalid platform");
        }
    }
}
