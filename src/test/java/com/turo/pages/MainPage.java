package com.turo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainPage extends Base{
    Logger logger = LoggerFactory.getLogger(MainPage.class);

    @FindBy(xpath = "//*[name()='use' and contains(@height,'72')]")
    public WebElement logo;





    public void verifyLogo(){
        logo.isDisplayed();
        logger.info("Turo logo is displayed");
    }

    String actual;  // actual in string value oldugunu belirtmek icin
    public void verifyTheFields(String value) // "LOg in" parametre{
        if(value.equals(login.getText())){}
    }

}
