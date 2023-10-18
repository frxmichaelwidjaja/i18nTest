package sample.pages;

import core.LangController;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonPage  {
    public static void validateTitle(WebDriver driver){
        System.out.println("Validate the title of the page");
        String currentTitle = driver.getTitle();
        String expectedTitle = LangController.langMap.get("title");
        boolean compareIgnoreCase = expectedTitle.equalsIgnoreCase(currentTitle)||currentTitle.contains(expectedTitle);
        Assert.assertTrue("Title is not as expected value. Expected value: "+expectedTitle+" and current title: "+currentTitle, compareIgnoreCase);
        if (compareIgnoreCase)
            System.out.println("Pass - title validation");
        else
            System.out.println("Failed - title validation");

    }

    public static void validateWebElementTextById(String id, WebDriver driver){
        System.out.println("Validate the text of id = "+id);
        String currentText = driver.findElement(By.id(id)).getText();
        String expectedText = LangController.langMap.get(id);
        boolean compareIgnoreCase = expectedText.equalsIgnoreCase(currentText);
        Assert.assertTrue("text is not as expected value. Expected value: "+expectedText+" and current text: "+currentText, compareIgnoreCase);
        if (compareIgnoreCase)
            System.out.println("Pass - text validation of web element id = "+id);
        else
            System.out.println("Failed - text validation of web element id = "+id);
    }

    public static void validateWebElementTextByClass(String className, WebDriver driver){
        System.out.println("Validate the text of class name = "+className);
        String currentText = driver.findElement(By.xpath("//*[@class='"+className+"']")).getText();
        String expectedText = LangController.langMap.get(className);
        boolean compareIgnoreCase = expectedText.equalsIgnoreCase(currentText);
        Assert.assertTrue("text is not as expected value. Expected value: "+expectedText+" and current text: "+currentText, compareIgnoreCase);
        if (compareIgnoreCase)
            System.out.println("Pass - text validation of web element class name = "+className);
        else
            System.out.println("Failed - text validation of web element class name = "+className);
    }
}
