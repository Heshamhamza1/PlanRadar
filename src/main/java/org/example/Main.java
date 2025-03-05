package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public  static WebDriver driver  = new ChromeDriver();
    public static void main(String[] args) throws InterruptedException {
          navigateUrl.navigate(driver);
          Login.InsertEmail(driver);
          navigateForms.Forms(driver);
          perfomActions.settingDefaultValues(driver);
          Quit.Close(driver);
        }
    }
