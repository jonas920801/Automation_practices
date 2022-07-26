package com.jonathanv.steps;

import com.jonathanv.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import java.util.Map;

public class LoginStep {

    @Page
    private LoginPage loginPage;

    @Step
    public void abrirNavegador(){
        loginPage.open();
    }

    @Step
    public void hacerAutenticacion(Map<String, String> credenciales){

            loginPage.digitarUsuario(credenciales.get("usuario"));
            loginPage.digitarClave(credenciales.get("clave"));
            loginPage.clickAutenticacion();

    }


}





