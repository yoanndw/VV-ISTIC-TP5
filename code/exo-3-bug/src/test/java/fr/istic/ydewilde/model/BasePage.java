package fr.istic.ydewilde.model;

import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver d) {
        driver = d;
    }
}