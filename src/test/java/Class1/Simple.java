package TestPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Simple {

    @Test
    public void launchPage(){
        System.setProperty("webdriver.chrome.driver", "./DriverExe/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        /**
         * WebDriver driver -> driver is the variable of WebDriver type.
         * new ChromeDriver() -> creating object of ChromeDriver class.
         *
         * String the object of ChromeDriver class into WebDriver
         *
         * ChromeDriver extends RemoteDriver; RemoteWebDriver implements WebDriver
         *
         */

        /**
         * get() method: To launch a webpage.
         */

        driver.get("https://www.facebook.com");




    }




}
