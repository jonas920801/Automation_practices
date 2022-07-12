package com.jonathanv.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class OrderPage extends PageObject {

    @FindBy (xpath = "//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[4]")
    WebElementFacade ProductosDescendente;

    public void OrdenarDescentende() {ProductosDescendente.click();}
}
