package utils;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadAndWritePropertyFile {
    private WebDriver driver;
     Properties properties;
     FileInputStream fileInputStream;

    String url;
    String email;
    String password;


    public ReadAndWritePropertyFile(WebDriver driver) throws IOException {
        this.driver = driver;
        fileInputStream = new FileInputStream("src/test/java/utils/testData.properties");
        properties = new Properties();
        properties.load(fileInputStream);
    }

    public String getUrl() {
        url = properties.getProperty("url");
        return url;
    }

    public void setUrl(String urlValue) {
      properties.setProperty("url", urlValue);
    }

    public String getEmail() {
        email = properties.getProperty("email");
        return email;
    }

    public void setEmail(String emailValue) {
        properties.setProperty("email", emailValue);
    }

    public String getPassword() {
        password = properties.getProperty("password");
        return password;
    }

    public void setPassword(String passwordValue) {
        properties.setProperty("password",passwordValue);
    }


}
