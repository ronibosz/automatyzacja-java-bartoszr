package com.codesprinters.pos.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage extends PageObject {

    private final String GOOGLE_URL = "https://www.google.com";
    private final By SEARCH_FIELD = By.name("q");

    public GooglePage(WebDriver driver) {
        super(driver);
    }

    public void goToGoogle(){
        driver.get(GOOGLE_URL);
    }

    public void searchOnGoogle(String query){
        WebElement googleSearchBox = driver.findElement(SEARCH_FIELD);
        googleSearchBox.sendKeys(query);
        googleSearchBox.sendKeys(Keys.ENTER);
    }

    public void clickOnResultContaining(String pattern){
        WebElement element = driver.findElement(resultWithPattern(pattern));
        element.click();
    }

    private By resultWithPattern(String pattern){
        return By.xpath("//a[text()='" + pattern + "']");
    }
}
