package com.jonathanv.stepdefinitions;

import com.jonathanv.steps.LoginStep;
import cucumber.api.java.es.Dado;
import net.thucydides.core.annotations.Steps;

import java.util.Map;

public class Hooks {
    @Steps
    LoginStep loginStep;
    @Dado("que el usuario ingresa a la pagina de soucelabs")
    public void queElUsuarioIngresaALaPaginaDeSoucelabs(Map<String, String> credenciales) {
        loginStep.abrirNavegador();
        loginStep.hacerAutenticacion(credenciales);
    }
}
