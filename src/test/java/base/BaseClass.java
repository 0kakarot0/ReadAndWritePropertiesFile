package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import page.LoginPage;
import utils.ReadAndWritePropertyFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

public class BaseClass {
    WebDriver driver;
    protected LoginPage loginPage;
    protected ReadAndWritePropertyFile propertyFile;

    @BeforeSuite
    public void setUpDriver() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        propertyFile = new ReadAndWritePropertyFile(driver);

        String url = propertyFile.getUrl();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
    }


}
