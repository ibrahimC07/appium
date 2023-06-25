package org.appium.first;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class AndAutomateBrowser {

    public static void main(String[] args) throws Exception {
        AppiumDriver driver = CreateBrowserSession.initializeDriver("iOS");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://app-test.ikincisans.com.tr/");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ccelikel1995@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Qvfn9mE6zf");
        WebElement element = driver.findElement(By.xpath("//button[@type='submit']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("svg")));

      //  driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
      //          "left", 100, "top", 100, "width", 600, "height", 600,
      //          "direction", "up",
      //          "percent", 0.75
      //  ));
        Map<String, Object> params = new HashMap<>();
        params.put("direction", "up");
        driver.executeScript("mobile: swipe", params);

/*        Dimension size = driver.manage().window().getSize();
        for(int i=0;i<2;i++){
            TouchAction t = new TouchAction(driver);
            t.press(PointOption.point(size.width / 2, (int) (size.height * 0.8)))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                    .moveTo(PointOption.point(size.width / 2, (int) (size.height * 0.2)))
                    .release()
                    .perform();
        }*/
//        Thread.sleep(10000);

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//li[contains(text(),'Dondurulmuş Gıda')]")
        )).click();
        //    driver.findElement(By.xpath("//button[@class='tds-btn tds-btn tds-btn--blue tds-btn--large']")).click();

    }
}
