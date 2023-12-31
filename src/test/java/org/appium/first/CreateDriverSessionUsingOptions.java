package org.appium.first;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class CreateDriverSessionUsingOptions {

    public static void main(String[] args) throws MalformedURLException {
        String appUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
                + File.separator + "resources" + File.separator + "UIKitCatalog-iphonesimulator.app";
        XCUITestOptions options = new XCUITestOptions().
                setDeviceName("iPhone 14").
                setAutomationName("XCUITest").
                setUdid("56AC0DD0-82B6-4EDA-9FF2-B0C44A3268D6").
                setApp(appUrl);

        URL url = new URL("http://0.0.0.0:4723");

        AppiumDriver driver = new IOSDriver(url, options);
/*        String appUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
                + File.separator + "resources" + File.separator + "ApiDemos-debug.apk";
        UiAutomator2Options options = new UiAutomator2Options().
                setDeviceName("Pixel_2").
                setAutomationName("UiAutomator2").
                setApp(appUrl);

        URL url = new URL("http://0.0.0.0:4723");

        AppiumDriver driver = new AndroidDriver(url, options);*/
    }
}
