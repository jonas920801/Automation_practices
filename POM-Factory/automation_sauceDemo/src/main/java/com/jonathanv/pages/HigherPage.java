package com.jonathanv.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class HigherPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"item_5_title_link\"]")
    WebElementFacade productoCaro;


    public void primerProductoCaro() {
        productoCaro.click();

    }
}