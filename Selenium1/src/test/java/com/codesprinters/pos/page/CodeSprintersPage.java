package com.codesprinters.pos.page;

import org.openqa.selenium.WebDriver;

public class CodeSprintersPage extends PageObject{

    public static final String CODE_SPRINTERS_URL = "http://agileszkolenia.pl/";
    public static final String CODE_SPRINTERS_TITLE = "Code Sprinters -";

    public CodeSprintersPage(WebDriver driver) {
        super(driver);
    }
}
