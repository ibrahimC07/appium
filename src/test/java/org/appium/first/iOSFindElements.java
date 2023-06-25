package org.appium.first;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public class iOSFindElements {

    public static void main(String[] args) throws Exception {
        AppiumDriver driver = UtilityClassForCreateDriver.initializeDriver("İOS");

        WebElement myElement = driver.findElement(AppiumBy.accessibilityId("Activity Indicators"));
        System.out.println(myElement.getText());

        myElement = driver.findElements(AppiumBy.className("XCUIElementTypeStaticText")).get(1);
        System.out.println(myElement.getText());

        myElement = driver.findElement(AppiumBy.name("Activity Indicators"));
        System.out.println(myElement.getText());

        myElement = driver.findElement(AppiumBy.id("Activity Indicators"));
        System.out.println(myElement.getText());

        myElement = driver.findElement(AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"Activity Indicators\"]"));
        System.out.println(myElement.getText());

//        myElement = driver.findElement(AppiumBy.tagName("Activity Indicators"));
//        System.out.println(myElement.getText());

    }
}
