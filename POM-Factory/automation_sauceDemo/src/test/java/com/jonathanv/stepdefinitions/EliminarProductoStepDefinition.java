package com.jonathanv.stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import com.jonathanv.steps.CarStep;
import com.jonathanv.steps.LoginStep;
import com.jonathanv.steps.ProductStep;

import java.util.Map;


public class EliminarProductoStepDefinition {

    @Steps
    LoginStep loginStep;
    @Steps
    ProductStep productStep;
    @Steps
    CarStep carStep;


    @Dado("que el usuario se encuentra en la pagina de soucelabs")
    public void queElUsuarioSeEncuentraEnLaPaginaDeSoucelabs(Map<String, String> credenciales) {
        loginStep.abrirNavegador();
        loginStep.hacerAutenticacion(credenciales);
    }

    @Cuando("el usuario agrega un producto al carrito el producto Sauce Labs Onesie")
    public void agregaAlCarrtioSauceLabsOnesie(){
        productStep.agregarProductoCarrito();
        productStep.irHaciaCarrito();
    }

   @Entonces("el usuario podra eliminar el producto del carrito")
    public void elUsuarioPuedeEliminarProductoDelCarrito(){
       carStep.eliminarProductoDelCarrito();
   }


}
