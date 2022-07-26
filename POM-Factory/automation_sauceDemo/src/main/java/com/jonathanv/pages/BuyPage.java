package com.jonathanv.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class BuyPage extends PageObject {


    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElementFacade addBackpack;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElementFacade addBikeLight;

    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    WebElementFacade addBoltShirt;

    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    WebElementFacade addJacket;

    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    WebElementFacade addLabsOnesie;

    @FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
    WebElementFacade addTshirtRed;






    public void buyBackpack () {
        addBackpack.click();
    }

    public void buyBikeLight () {
        addBikeLight.click();
    }

    public void buyBoldShirt () {
        addBoltShirt.click();
    }

    public void buyJacket () {
        addJacket.click();
    }

    public void buyLabsOnesie () {
        addLabsOnesie.click();
    }

    public void buyTshirtRed () {
        addTshirtRed.click();
    }

}
