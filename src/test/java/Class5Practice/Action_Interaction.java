package Class5Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action_Interaction {
    @Test
    public void Interaction(){
        System.setProperty("webdriver.chrome.driver", "./DriverExe/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.yahoo.com/");

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {

        }
        // Actions
        /**
         * mouseHover -> moveToElement()
         * drag and drop -> dragAndDrop()
         * right click -> contextClick()
         * double click -> doubleClick()
         */
        WebElement bellIcon = driver.findElement(By.xpath("//label[@for='ybarNotificationMenu']"));
        Actions act = new Actions (driver);

        act.moveToElement(bellIcon).build().perform();
        act.click(bellIcon).build().perform();

    }


}
