package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pageObjects.HomePage;

import java.time.Duration;

public class BaseClass {
    public WebDriver driver;
    @BeforeClass
    public void setupt(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        //driver.manage().deleteAllCookies();
        driver.get("https://demo.opencart.com/");
        System.out.println("inside base class------>");
    }

}
