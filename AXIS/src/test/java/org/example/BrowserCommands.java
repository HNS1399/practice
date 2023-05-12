package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "A:\\mmm\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
        // maximize the window
        driver.manage().window().maximize();

        String title  = driver.getTitle();
        System.out.println(title);

        String currenURL = driver.getCurrentUrl();
        System.out.println(currenURL);

        String pagesource = driver.getPageSource();
        System.out.println(pagesource);

        driver.close();










    }
}
