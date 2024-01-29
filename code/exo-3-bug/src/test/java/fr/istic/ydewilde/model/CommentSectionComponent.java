package fr.istic.ydewilde.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CommentSectionComponent extends BaseComponent {
    private By usernameBy;
    private By contentBy;
    private By postBy;

    public CommentSectionComponent(WebElement root) {
        super(root);
        usernameBy = By.xpath("/html/body/app-root/app-answer-poll/div/p-card/div/div/div[4]/div/div[1]/input");
        contentBy = By.xpath("/html/body/app-root/app-answer-poll/div/p-card/div/div/div[4]/div/div[2]/textarea");
        postBy = By.xpath("/html/body/app-root/app-answer-poll/div/p-card/div/div/div[4]/div/div[3]/p-button/button");
    }

    public boolean canPostComment() {
        WebElement postButton = root.findElement(postBy);
        return postButton.isDisplayed() && postButton.isEnabled();
    }

    public void postComment(String username, String content) {
        root.findElement(usernameBy).sendKeys(username);
        root.findElement(contentBy).sendKeys(content);
        root.findElement(postBy).click();
    }
    
}
