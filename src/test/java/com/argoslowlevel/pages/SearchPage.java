package com.argoslowlevel.pages;

import com.argoslowlevel.driverFactory.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SearchPage extends DriverFactory {

    @FindBy(id = "consent_prompt_submit")
    WebElement cookies;

    @FindBy(css = "input[name='searchTerm']")
    WebElement searchBox;

    @FindBy(className = "_2mKaC")
    WebElement searchButton;

    @FindBy(css = "div[data-el='search-title']")
    WebElement searchResultHeader;

    public void search(String value) {
        searchBox.sendKeys(value);
    }

    public void buttonClick() {
        searchButton.click();
    }

    public void getURL() {
        String actual = driver.getCurrentUrl();
        System.out.println("The URL is " + actual);
        //Assert.assertThat("The argos url is ", actual,Matchers.equalTo("https://www.argos.co.uk/"));
        Assert.assertTrue(actual.endsWith(".argos.co.uk/"));
    }
    public void acceptCookies() {
        cookies.click();
    }

    public void searchHeader() {
        String actual = searchResultHeader.getText();
        System.out.println("The search results contain " + actual);
        Assert.assertTrue(actual.endsWith("nike"));
    }

}
