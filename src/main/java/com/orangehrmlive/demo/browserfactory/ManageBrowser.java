package com.orangehrmlive.demo.browserfactory;

import com.orangehrmlive.demo.propertyreader.PropertyReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.time.Duration;

public class ManageBrowser {
    //WebDriver declared public static to allow access from other packages
    public static WebDriver driver;
    //baseUrl defined within config.properties file which is accessed by PropertyReader
    static String baseUrl = PropertyReader.getInstance().getProperty("baseUrl");

    public void selectBrowser(String browser){
        //method to handle browser choice defined in config.properties file
        if (browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }else if (browser.equalsIgnoreCase("ie")){
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        }else {
            System.out.println("Wrong browser name");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(baseUrl);
    }
    public void closeBrowser(){
        if(driver!=null){
            driver.quit();
        }
    }
}
