package Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice {
    @Test
    public void enterAddressInDarksky() {
        System.setProperty("webdriver.chrome.driver", "./DriverExe/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.darksky.net");


        //driver.findElement(By.xpath("//input[@type='text']")).sendKeys("10001");

        // write code to remove the present text in search bar
        //driver.findElement(By.xpath("//input[not@type='text']")).clear();
        //driver.findElement(By.xpath("//input[not@type='text']")).sendKeys("10001");



        // write code to click on search icon
        //driver.findElement(By.className("searchButton")).click();
        //driver.findElement(By.xpath("//img[@alt='Search Button']")).click();




    }
}
