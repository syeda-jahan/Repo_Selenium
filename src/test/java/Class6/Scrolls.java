package Class6;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrolls {

    @Test
    public void scrolls(){
        System.setProperty("webdriver.chrome.driver", "./DriverExe/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hotels.com");
        /**
         * Use javascript to scrool
         * scroll by pixel
         */
        JavascriptExecutor js = (JavascriptExecutor)driver;
        //type-casting -changing the driver-datatype

        js.executeScript("scrollBy(0,700);");
        // scroll downward 700 pixels
        //Thread.sleep(500);
        js.executeScript("scrollBy(0,-700);");

        WebElement elem = driver.findElement(By.id(""));
        js.executeScript("arguments[0].scrollIntoView(true);",elem);

        // scroll to bottom
        //js.executeScript()




    }
}
