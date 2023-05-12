package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practise {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "A:\\mmm\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        // maximize the window
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("Shreenivas");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("hegde");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]")).sendKeys("1234567890");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("shreenivas@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]")).sendKeys("1234567890");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//tbody/tr[9]/td[2]/input[1]")).sendKeys("karnataka");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]")).sendKeys("abcd");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//tbody/tr[10]/td[2]/input[1]")).sendKeys("560016");
        Thread.sleep(3000);
        Select countrySelect = new Select(driver.findElement(By.name("country")));
        countrySelect.selectByValue("INDIA");
        Thread.sleep(3000);
        WebElement submit = driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]"));

        Actions alt3 = new Actions(driver);

        Action seriesofactions3 = alt3.moveToElement(submit).click().keyDown(submit, Keys.ENTER).sendKeys(submit, "").build();

        seriesofactions3.perform();

        Thread.sleep(3000);




    }
}
