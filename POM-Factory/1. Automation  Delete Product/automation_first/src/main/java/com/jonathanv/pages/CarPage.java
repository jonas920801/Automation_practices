package com.jonathanv.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CarPage extends PageObject {

    @FindBy(id="remove-sauce-labs-onesie")
    WebElementFacade eliminarProducto;


    public void quitarProducto(){
        eliminarProducto.click();
    }



}
