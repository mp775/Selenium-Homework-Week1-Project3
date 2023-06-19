package herokupp_baseurl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {

        String baseUrl = "http://the-internet.herokuapp.com/login";
        WebDriver driver = new ChromeDriver();
        //Open The Url in Browser
        driver.get(baseUrl);
        // Maximise Window
        driver.manage().window().maximize();
        //We Give Implicit wait to drive
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get the title of the page
        String title = driver.getTitle();
        System.out.println("Page Title is " + driver.getTitle());
        //get the current url
        System.out.println("Current URL" + driver.getCurrentUrl());
        //get the source code
        System.out.println("Page Source" + driver.getPageSource());
        //find the Email element
        WebElement emailfield = driver.findElement(By.id("username"));
        emailfield.sendKeys("prime123@gmail.com");
        //find the password element
        WebElement passwordfield = driver.findElement(By.name("password"));
        passwordfield.sendKeys("Prime123");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //close browser
        driver.close();
    }
}