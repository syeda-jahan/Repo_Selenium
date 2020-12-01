package Homework12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Homework {
    @Test
    public void feelsLikeTemp(){
        System.setProperty("webdriver.chrome.driver", "./DriverExe/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://darksky.net/");

        /**
         *
         * Homework - 12
         * Due Date: Nov 23, 2020 (Monday)
         *
         * Testcase 1: Verify the feels-like temp value is between low and high temp values at any zipcode
         *
         * Testcase 2: Verify the dates on the Blog Page page appears in reverse chronological order
         *
         * Testcase 3: Verify the temperature value converts as expected as the the unit selected
         */

        // Testcase 1:
        WebElement feelsTemp = driver.findElement(By.xpath("//*[@class='feels-like-text']"));
        String feelsTempText = feelsTemp.getText(); //"64*"
        int degIndex1 = feelsTempText.indexOf("˚");
        String feelsLike = feelsTempText.substring(0,degIndex1); // "64"
        int feelsLikeInt = Integer.valueOf(feelsLike); // 64

        WebElement lowTemp = driver.findElement(By.xpath("//*[@class='low-temp-text']"));
        String lowTempText = lowTemp.getText(); // "50˚"
        int degIndex2 = lowTempText.indexOf("˚");
        String lowTempValue = lowTempText.substring(0,degIndex2);
        int low = Integer.valueOf(lowTempValue);

        WebElement highTemp = driver.findElement(By.xpath("//*[@class='high-temp-text']"));
        String highTempText = highTemp.getText(); // "65˚"
        int degIndex3 = highTempText.indexOf("˚");
        String highTempValue = highTempText.substring(0,degIndex3);
        int high = Integer.valueOf(highTempValue); // 65


        Assert.assertTrue((feelsLikeInt > low && feelsLikeInt < high )," high < feelsLikeInt < low ");

    }

    // # 2
    @Test
    public void verifyBlogDates(){

        System.setProperty("webdriver.chrome.driver", "./DriverExe/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://blog.darksky.net/");

        WebElement latestDate = driver.findElement(By.xpath("//time[text()='August 1, 2020']")); // "August 1, 2020"
        String latestDateStr= "August 1, 2020";
        Date myParseDate1 = null;
        SimpleDateFormat df1 = new SimpleDateFormat("MMMM d, yyyy");
        try {
            myParseDate1 = df1.parse(latestDateStr);
            System.out.println(myParseDate1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //System.out.println("Latest date comes before to : " + myParseDate1);

        WebElement pastDate = driver.findElement(By.xpath("//time[text()='July 1, 2020']")); // "July 1, 2020"
        String pastDateStr= "July 1, 2020";
        Date myParseDate2= null;
        SimpleDateFormat df2 = new SimpleDateFormat("MMMM d, yyyy");
        try {
            myParseDate2 = df2.parse(pastDateStr);
            System.out.println(myParseDate2);
        } catch (ParseException e) {
            e.printStackTrace();
        }


        WebElement veryPastDate = driver.findElement(By.xpath("//time[text()='March 31, 2020']")); // "March 31, 2020"
        String veryPastDateStr= "March 31, 2020";
        Date myParseDate3 = null;
        SimpleDateFormat df3 = new SimpleDateFormat("MMMM d, yyyy");
        try {
            myParseDate3 = df3.parse(veryPastDateStr);
            System.out.println(myParseDate3);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //System.out.println("Latest date comes after pastDate : " + myParseDate1.after(myParseDate2));
        //System.out.println("Very Past date comes before pastDate : " + myParseDate1.after(myParseDate2));
        Assert.assertTrue((myParseDate1.after(myParseDate2)) && (myParseDate2.after(myParseDate3)), "The dates on the Blog Page page are not appear in reverse chronological order");

    }


    // 3 #Verify the temperature value converts as expected as the the unit selected
    @Test
    public void verifyTempConversion(){
        System.setProperty("webdriver.chrome.driver", "./DriverExe/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://darksky.net/");

        /**
         * double cTemp = ( fTemp -32) * 5/9
         * 1.current value = 51
         *
         */
        WebElement currentTempElement = driver.findElement(By.xpath("//span[@class='summary swap']"));
        String currentTempStr = currentTempElement.getText();
        String[] tempArr = currentTempStr.split("˚");
        int tempInt = Integer.valueOf(tempArr[0]);

        int expectedTempInt = (tempInt-32) * 5/9 ;

        WebElement dropDownButton = driver.findElement(By.className("button"));
        dropDownButton.click();

        WebElement afterConvTempElement = driver.findElement(By.xpath("//span[@class='summary swap']"));
        String afterConvTempStr = afterConvTempElement .getText();
        String[] actualTempArr = afterConvTempStr.split("˚");
        int actualTempInt = Integer.valueOf(actualTempArr[0]);

        Assert.assertEquals(expectedTempInt,actualTempInt,"The temperature value does not convert as expected as the the unit selected");


    }

}
