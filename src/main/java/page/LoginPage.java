package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;

    private By email = By.name("username");
    private By password = By.name("password");
    private By loginBtn = By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmail(String emailString){
        WebElement element = driver.findElement(email);
        waitTillElementGetVisible(element);
        element.sendKeys(emailString);
    }

    public void setPassword(String passwordString){
        WebElement element = driver.findElement(password);
        waitTillElementGetVisible(element);
        element.sendKeys(passwordString);
    }

    public void clickLoginBtn(){
        driver.findElement(loginBtn).click();
    }

    public void waitTillElementGetVisible(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}

