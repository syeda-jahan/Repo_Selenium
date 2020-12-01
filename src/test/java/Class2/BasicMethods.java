package Class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicMethods {

    @Test
    public void basicMethods(){
        System.setProperty("webdriver.chrome.driver", "./DriverExe/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        /**
         * get()-> need few more second to navigate next page.
         * navigate().to()
         */
        driver.navigate().to("https://www.facebook.com/");
        /**
         *
         * maximize the webpage
         */
        driver.manage().window().maximize();

        /**
         * get the page title
         */

        String pageTitle = driver.getTitle();
        System.out.println("Page title: " + pageTitle);

        /**
         * get the page URL
         */
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        // Navigate to back and forward
        driver.navigate().back();
        driver.navigate().forward();

        /**
         * to Refresh a webpage ->>
         * 1. navigate().refresh()
         * 2. launch current url
         */
        //1
        driver.navigate().refresh();

        //2
        String currUrl = driver.getCurrentUrl();
        driver.get(currUrl);

        // - OR -
        driver.get(driver.getCurrentUrl());

        // 3
        driver.navigate().back();
        driver.navigate().forward();

        /**
         * to close the web-page
         * 1. if we want to close ->> quit()
         * 2. if we want to close ->> close()
         *
         */
        //driver.close();
        driver.quit();


    }
}
