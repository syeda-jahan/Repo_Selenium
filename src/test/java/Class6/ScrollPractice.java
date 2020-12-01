package Class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ScrollPractice {
    @Test
    public void scroll(){
        System.setProperty("webdriver.chrome.driver", "./DriverExe/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.darksky.net");


        //3
        WebElement timeButton = driver.findElement(By.xpath("//a[text()='Time Machine']"));
        timeButton.click();
        //js.executeScript("window.scrollTo(0,document.body.scrollHeight);");

        //String todayDate = driver.findElements(By.xpath("//button[text()='30']")).getText();

        SimpleDateFormat format = new SimpleDateFormat("d");
        Date date = new Date();



    }
}
