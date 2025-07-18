package Tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import static java.lang.System.getProperty;

public class TestBase extends AbstractTestNGCucumberTests {
    public static WebDriver driver;


    @BeforeSuite
    public void startDriver () throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
    }

    @AfterSuite
    public void  closeDriver (){
        driver.quit();

    }

}
