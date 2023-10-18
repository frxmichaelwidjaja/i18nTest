package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.*;

public class WebDriverController {
    public static WebDriver driver;

    /**
     * open the URL page using written chrome options
     * @param url
     */
    public static void open(String url){

        // System Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"/src/test/resources/"+"chromedriver.exe");
        driver = null;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("enable-automation");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-browser-side-navigation");
        options.addArguments("--disable-gpu");
        options.addArguments("--allowed-ips");
        options.addArguments("--remote-allow-origins=*");

        Map prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.geolocation", 1); // 1:allow 2:block

        options.setExperimentalOption("prefs", prefs);

        driver = new ChromeDriver(options);
        driver.get(url);
    }

}
