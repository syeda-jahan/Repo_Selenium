package Class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;

public class EnabledDisplayedSelected {

    @Test
    public void displayed() {
        System.setProperty("webdriver.chrome.driver", "./DriverExe/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
        boolean isloginButtonDisplayed = loginButton.isDisplayed();
        Assert.assertTrue(isloginButtonDisplayed, "Log in button is not displayed");

    }

    @Test
    public void selected (){
        System.setProperty("webdriver.chrome.driver", "./DriverExe/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        WebElement createNewAccount = driver.findElement(By.xpath("//a[text()='Create New Account']"));
        createNewAccount.click();

        WebElement femaleButton = driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input[@type='radio']"));
        boolean femaleButtonSelected = femaleButton.isSelected();
        Assert.assertFalse(femaleButtonSelected, "Female radio button is not selected");

        if(!femaleButtonSelected) {
            femaleButton.click();
        }
        Assert.assertTrue(femaleButtonSelected, "Female radio button is still not selected");
        

    }


}
