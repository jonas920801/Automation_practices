package com.jonathanv.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class ProductsPage extends PageObject {

    @FindBy (xpath = "//*[@id=\"add-to-cart-sauce-labs-onesie\"]")
    WebElementFacade  productoCamiseta;

    @FindBy (className = "shopping_cart_link")
    WebElementFacade irCarrito;


    public void agregaCarrito(){
        productoCamiseta.click();
    }

    public void clicCarrito(){
        irCarrito.click();

    }


}
