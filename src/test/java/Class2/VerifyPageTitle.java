package Class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyPageTitle {
    /**
     * 1. open f.b homepage using URL "https://www.facebook.com/"
     * 2. Verify the page title is "Facebook - log in or sign up"
     * 3. Close the opened webpage.
     *
     */

    @Test
    public void verifyWebPageTitle() {
        // step-1
        System.setProperty("webdriver.chrome.driver", "./DriverExe/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        // step-2
        String acceptedTitle = "Facebook - log In or Sign up";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(acceptedTitle, actualTitle, "Page title doesn't match the expected");

        // step -3
        driver.quit();

    }
}
