package com.jonathanv.pages;


import net.bytebuddy.implementation.bind.annotation.Default;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;


@DefaultUrl("https://www.saucedemo.com/")


public class LoginPage extends PageObject {

    @FindBy(id="user-name")
    WebElementFacade inputUser;

    @FindBy(id="password")
    WebElementFacade inputPass;

    @FindBy(id="login-button")
    WebElementFacade btnLogin;



    public void digitarUsuario(String usuario){
        inputUser.sendKeys (usuario);
    }

    public void digitarClave(String clave){
        inputPass.sendKeys (clave);
    }

    public void clickAutenticacion(){
        btnLogin.click();
    }

}
