package Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UsingLocators2 {
    @Test
    public void usingLocator(){
        System.setProperty("webdriver.chrome.driver", "./DriverExe/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        // tagName
        String myTagName = "button";
        By createAccountLocator = By.tagName(myTagName);
        WebElement createAccountButton = driver.findElement(createAccountLocator);
        createAccountButton.click();
        //driver.findElement(By.tagName("button")).click();

        // linkText
        driver.findElement(By.tagName("Create New Account")).click();

        //partialLinkText
        String vicText = "Voting Information";
        driver.findElement(By.tagName("Voting Information")).click();


    }


}
