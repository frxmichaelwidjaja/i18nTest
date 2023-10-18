package sample.pages;

import core.LangController;
import core.WebDriverController;
import org.openqa.selenium.WebDriver;

public class HomepagePage {
    public static WebDriver driver;

    /**
     * Base of test case to validate the homepage.
     * @param lang
     */
    public static void validateHomepage(String lang) {
        // Collect data from lang package and add to hashmap
        String filename = System.getProperty("user.dir") +"/src/test/resources/lang/"+lang+".txt";
        LangController.setLangMap(LangController.getExpectedHashMap(filename));
        // Open the page
        if (lang.compareTo("en")==0)
            WebDriverController.open("https://www.bluetooth.com/");
        else
            WebDriverController.open("https://www.bluetooth.com/"+lang+"/");
        driver = WebDriverController.driver;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Validate Title
        System.out.print("1. ");
        CommonPage.validateTitle(driver);
        // Validate text of class name = menu-item-426
        System.out.print("2. ");
        CommonPage.validateWebElementTextByClass("login-link btn btn-black", driver);
        // Validate text of id = menu-item-417
        System.out.print("3. ");
        CommonPage.validateWebElementTextById("menu-item-417", driver);
        // Validate text of id = menu-item-426
        System.out.print("4. ");
        CommonPage.validateWebElementTextById("menu-item-426", driver);
        // Validate text of id = menu-item-55419
        System.out.print("5. ");
        CommonPage.validateWebElementTextById("menu-item-55419", driver);
        driver.close();
        driver.quit();
    }
}
