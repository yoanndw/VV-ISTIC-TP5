package fr.istic.ydewilde;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testPostCommentButtonShouldBeEnabledAfterPosting()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:4200");
        System.out.println(driver.getTitle());



        assertTrue();
    }
}
