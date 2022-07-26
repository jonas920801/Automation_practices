package com.jonathanv.stepdefinitions;


import com.jonathanv.pages.BuyPage;
import com.jonathanv.steps.*;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import java.util.Map;

public class ComprarProductoStepDefinition {

@Steps
    BuyStep buyStep;

@Steps
    ProductStep productStep;

@Steps
    CheckoutStep checkoutStep;


@Steps
    FinishStep finishStep;


       @Cuando("el usuario agrega todos  los productos")
       public void ElUsuarioAgregaTodosLosProductosAlCarrito (){
           buyStep.addToCarBackPack();
           buyStep.addToCarBikeLight();
           buyStep.addToCarBoltShirt();
           buyStep.addToCarJacket();
           buyStep.addToCarOnesie();
           buyStep.addToCarTshirtRed();
           productStep.irHaciaCarrito();
       }

       @Cuando("realiza el checkout")
       public void ElUsuarioRealizaElCheckOut(Map<String, String> datosCheckout){

           checkoutStep.hacerCheckOut(datosCheckout);
       }

       @Entonces("el usuario podra realizar la compra exitosamente")
       public void ElUsuarioRealizarCompraExistosa(){

           finishStep.finalizarCompra();

       }

    }

