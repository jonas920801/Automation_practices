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
    OrderStep orderStep;

    @Steps
    HigherStep higherStep;



    @Cuando( "el usuario ordena los productos de mayor a menor precio")
    public void elUsuarioOrdernaLosProductosDescendentemente (){
        orderStep.ordenarProductosDescentemente();

    }

    @Entonces( "el usuario debe visualizar los productos en orden descendente")
    public void elUsuarioVisualizaLosProductosDescendentemente(){
        higherStep.comprobarProductoMasCaro();
    }


}
