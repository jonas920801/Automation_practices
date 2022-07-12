package com.jonathanv.stepdefinitions;

import com.jonathanv.steps.HigherStep;
import com.jonathanv.steps.LoginStep;
import com.jonathanv.steps.OrderStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.util.Map;

public class OrdenarProductoStepDefinition {

    @Steps
    LoginStep loginStep;

    @Steps
    OrderStep orderStep;

    @Steps
    HigherStep higherStep;

    @Dado("que el usuario ingresa a la pagina de soucelabs")
    public void queElUsuarioIngresaALaPaginaDeSoucelabs(Map<String, String> credenciales) {
        loginStep.abrirNavegador();
        loginStep.hacerAutenticacion(credenciales);
    }

    @Cuando( "el usuario ordena los productos de mayor a menor precio")
    public void elUsuarioOrdernaLosProductosDescendentemente (){
        orderStep.ordenarProductosDescentemente();

    }

    @Entonces( "el usuario debe visualizar los productos en orden descendente")
    public void elUsuarioVisualizaLosProductosDescendentemente(){
        higherStep.comprobarProductoMasCaro();
    }


}
