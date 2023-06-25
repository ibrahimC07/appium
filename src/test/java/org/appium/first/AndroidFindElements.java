package org.appium.first;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.appium.first.UtilityClassForCreateDriver;
import org.openqa.selenium.WebElement;

public class AndroidFindElements {

    public static void main(String[] args) throws Exception {
        AppiumDriver driver = UtilityClassForCreateDriver.initializeDriver("Android");

        Thread.sleep(4000);
        WebElement myElement = driver.findElement(AppiumBy.accessibilityId("Accessibility"));
        System.out.println(myElement.getText());

        myElement = driver.findElements(AppiumBy.id("android:id/text1")).get(1);
        System.out.println(myElement.getText());

        myElement = driver.findElements(AppiumBy.className("android.widget.TextView")).get(2);
        System.out.println(myElement.getText());

        myElement = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Accessibility\"]"));
        System.out.println(myElement.getText());

        myElement = driver.findElement(AppiumBy.xpath("//*[@text=\"Accessibility\"]"));
        System.out.println(myElement.getText());

        myElement = driver.findElement(AppiumBy.tagName("Accessibility"));
        System.out.println(myElement.getText());

    }
}
