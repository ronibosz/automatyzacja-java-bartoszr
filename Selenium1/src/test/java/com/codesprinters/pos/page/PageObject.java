package com.codesprinters.pos.page;

import org.openqa.selenium.WebDriver;

public abstract class PageObject {

    protected WebDriver driver;

    public PageObject(WebDriver driver){
        this.driver = driver;
    }
}
