package fr.istic.ydewilde.model;

import org.openqa.selenium.WebElement;

public class BaseComponent {
    protected WebElement root;

    public BaseComponent(WebElement r) {
        root = r;
    }
}
