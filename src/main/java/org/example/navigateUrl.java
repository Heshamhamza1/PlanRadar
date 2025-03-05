package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;

public class navigateUrl {
    public static void navigate(WebDriver driver) {
        driver.navigate().to("https://www.planradar.com/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait( driver , Duration.ofSeconds(1));
        driver.findElement(By.xpath("/html/body/dialog/div[2]/div/div[2]/div[2]/div[2]/div[3]/button")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"menu-item-26230\"]/a")));
        driver.findElement(By.xpath("//*[@id=\"menu-item-26230\"]/a")).click();
    }
}
