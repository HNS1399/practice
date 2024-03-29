package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "A:\\mmm\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/login/");
        // maximize the window
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.xpath("//input[@id='email']"));

        Actions alt = new Actions(driver);

        Action seriesofactions = alt.moveToElement(username).click().keyDown(username , Keys.SHIFT).sendKeys(username, "SHREENIVAS").build();

        seriesofactions.perform();


    }

}
