package org.appium.first;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class FetchElementAttributes {

    public static void main(String[] args) throws Exception {
//        AppiumDriver driver = UtilityClassForCreateDriver.initializeDriver("İOS");
//
//        By accessibility = AppiumBy.accessibilityId("Activity Indicators");
//        System.out.println("label:" + driver.findElement(accessibility).getText());
//        System.out.println("label:" + driver.findElement(accessibility).getAttribute("label"));
//        System.out.println("value:" + driver.findElement(accessibility).getAttribute("value"));
//        System.out.println("enabled:" + driver.findElement(accessibility).getAttribute("enabled"));
//        System.out.println("selected:" + driver.findElement(accessibility).getAttribute("selected"));
//        System.out.println("visible:" + driver.findElement(accessibility).getAttribute("visible"));
//
//        System.out.println("selected:" + driver.findElement(accessibility).isSelected());
//        System.out.println("enabled:" + driver.findElement(accessibility).isEnabled());
//        System.out.println("displayed:" + driver.findElement(accessibility).isDisplayed());
        AppiumDriver driver = UtilityClassForCreateDriver.initializeDriver("Android");
        Thread.sleep(4000);

        By accessibility = AppiumBy.accessibilityId("Accessibility");
        System.out.println("label:" + driver.findElement(accessibility).getText());


        System.out.println("enabled:" + driver.findElement(accessibility).getAttribute("enabled"));
        System.out.println("selected:" + driver.findElement(accessibility).getAttribute("selected"));
        System.out.println("visible:" + driver.findElement(accessibility).getAttribute("clickable"));

        System.out.println("selected:" + driver.findElement(accessibility).isSelected());
        System.out.println("enabled:" + driver.findElement(accessibility).isEnabled());
        System.out.println("clickable:" + driver.findElement(accessibility).isDisplayed());


    }
}
// How to fetch element attributes?