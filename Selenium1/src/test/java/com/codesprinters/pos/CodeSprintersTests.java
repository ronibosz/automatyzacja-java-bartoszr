package com.codesprinters.pos;

import com.codesprinters.pos.page.CodeSprintersPage;
import com.codesprinters.pos.page.GooglePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CodeSprintersTests extends TestBase {

    private final String CODE_SPRINTERS_QUERY = "Code Sprinters";

    @Test
    public void verifyIfGoogleFindsCodeSprinters()throws InterruptedException{
        GooglePage googlePage = new GooglePage(driver);
        googlePage.goToGoogle();
        googlePage.searchOnGoogle(CODE_SPRINTERS_QUERY);
        googlePage.clickOnResultContaining(CodeSprintersPage.CODE_SPRINTERS_TITLE);

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleIs(CodeSprintersPage.CODE_SPRINTERS_TITLE));


        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        Assert.assertEquals(currentUrl, CodeSprintersPage.CODE_SPRINTERS_URL);

        Thread.sleep(5000);
    }
}
