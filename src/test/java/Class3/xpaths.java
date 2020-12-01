package Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class xpaths {

    @Test
    public void xPaths (){
        System.setProperty("webdriver.chrome.driver", "./DriverExe/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");


        // attr : //tag[@attrName='value']
        // text : //tag[text()='value']
        String logInXpath = "//button[text()='Log In']";
        By logInLocator = By.xpath(logInXpath);
        WebElement logIn = driver.findElement(logInLocator);
        logIn.click();
        // or
        //driver.findElement(By.xpath("//button[text()='Log In']").click();

        driver.findElement(By.xpath("//input[@aria-label='Email or Phone Number']")).sendKeys("abc@yahoo.com");

        // Partial text : //tag[contains(@attrName, 'partial value']
        driver.findElement(By.xpath("//input[contains(@aria-label, 'First ')]")).sendKeys("first");

        driver.findElement(By.xpath("//a[contains(text().'Voting')]")).click();

        // Partial text (Starts-with) : //tag[starts with(@attrName,'partial value']
        // Partial text (Starts-with) : //tag[starts with(text(),'partial value']

        // and/or : tag[@attrName='attr value' and contains(text(), 'partial v')]


        // not() :
        // text -: //tag[not(text()='value')] ..attr: //tag[not(@attr='Attribute Value')]
        //contains: //tag[not(contains(@attr, 'Attribute Value;))]

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("10001");






    }
}
