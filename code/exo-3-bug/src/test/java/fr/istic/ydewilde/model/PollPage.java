package fr.istic.ydewilde.model;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PollPage extends BasePage {
    private CommentSectionComponent commentSectionComponent;

    public PollPage(WebDriver driver) {
        super(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement commentSectionElement = driver
                .findElement(By.xpath("/html/body/app-root/app-answer-poll/div/p-card/div/div/div[4]"));
        commentSectionComponent = new CommentSectionComponent(commentSectionElement);
    }

    public void postComment(String username, String content) {
        commentSectionComponent.postComment(username, content);
    }
}
