package Class5Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class EnabledDisabled {

    @Test
    public void facebook (){
        System.setProperty("webdriver.chrome.driver", "./DriverExe/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        driver.findElement(By.xpath("//a[text()='Create New Account']")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }

        WebElement monthName= driver.findElement(By.id("month"));
        Select month = new Select(monthName);
        month.selectByVisibleText("Feb");

        WebElement dayElm = driver.findElement(By.id("day"));
        Select day = new Select(dayElm);
        day.selectByValue("4");

        WebElement yearElm = driver.findElement(By.id("year"));
        Select year = new Select(yearElm);
        year.selectByIndex(5); //2015

        WebElement signUp = driver.findElement(By.id("//button[@name='websubmit']"));
        signUp.click();



    }
}
