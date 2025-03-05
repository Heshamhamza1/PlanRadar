package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class navigateForms {
    public static void Forms(WebDriver driver) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement targetElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/div[8]/div")));
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        actions.moveToElement(targetElement).perform();
        WebElement lists = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@data-testid='navigation_forms']")));
        lists.click();
    }
}
