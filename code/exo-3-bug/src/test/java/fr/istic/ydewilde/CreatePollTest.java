package fr.istic.ydewilde;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import fr.istic.ydewilde.model.CreatePollPage;

/**
 * Unit test for simple App.
 */
public class CreatePollTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void couldNotGoToNextPollCreationStepsWhenOnFirstStep() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:4200/create");
        System.out.println(driver.getTitle());

        CreatePollPage createPollPage = new CreatePollPage(driver);
        assertTrue(createPollPage.canGoToStep1());
        assertFalse(createPollPage.canGoToStep2());
        assertFalse(createPollPage.canGoToStep3());
    }
}
