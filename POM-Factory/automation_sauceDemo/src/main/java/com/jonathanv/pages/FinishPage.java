package com.jonathanv.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class FinishPage extends PageObject {

    @FindBy (xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElementFacade buySuccesful;



    public void finalizarCompra(){
        buySuccesful.isPresent();

    }


}
