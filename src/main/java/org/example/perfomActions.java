package org.example;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class perfomActions {
    public static void settingDefaultValues(WebDriver driver) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));


        WebElement elements = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ticket-type-list\"]/div[2]/div/div[2]/div/div[2]/div/div[1]/div[1]/div/span")));
        elements.click();

        WebElement title = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div[1]/div/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/div[2]/span")));
        title.click();

        WebElement defaultTitle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-id='Setup_Forms_Title_DefaultValue']")));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        defaultTitle.clear();
        defaultTitle.sendKeys("Default Title");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/div[2]/span")).click();
        WebElement shortText = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-id='Setup_Forms_ShortText_DefaultValue']")));
        shortText.click();
        shortText.clear();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        shortText.sendKeys("Default short text");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[2]/div/div/div[2]/div[1]/div/div/div[3]/div/div[2]/span")).click();
        WebElement longText = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-id='Setup_Forms_LongText_DefaultValue']")));

        longText.click();
        longText.clear();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        longText.sendKeys("Default Long text");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[2]/div/div/div[2]/div[1]/div/div/div[4]/div/div[2]/span")).click();
        WebElement checkBox = wait.until(ExpectedConditions.elementToBeClickable(By.id("Checked by default")));

        checkBox.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        WebElement element = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[2]/div/div/div[2]/div[1]/div/div/div[5]/div/div[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

        WebElement list = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div[1]/div/div[2]/div/div/div[2]/div[1]/div/div/div[5]/div/div[2]/span")));
        list.click();
        driver.findElement(By.id("Mandatory")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div/button[1]/div")).click();

        WebElement view = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/header/div[2]/button[1]/div/span")));
        view.click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@data-testid='ticket-details-wrapper']")));

        driver.findElement(By.xpath("//*[@data-testid='tickets_details_closenewticket']")).click();
    }
}
