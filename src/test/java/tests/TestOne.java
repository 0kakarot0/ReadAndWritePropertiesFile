package tests;

import base.BaseClass;
import org.testng.annotations.Test;

public class TestOne extends BaseClass {

    @Test
    public void readFromFile(){
        System.out.println("Email is "+propertyFile.getPassword());
    }
    @Test
    public void writeToFIle(){
        propertyFile.setEmail("mynewEmail@gmail.com");
    }
    @Test
    public void loginTest(){
        loginPage.setEmail(propertyFile.getEmail());
        loginPage.setPassword(propertyFile.getPassword());
        loginPage.clickLoginBtn();
    }
}
