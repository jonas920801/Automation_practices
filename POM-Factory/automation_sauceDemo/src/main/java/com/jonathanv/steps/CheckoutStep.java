package com.jonathanv.steps;

import com.jonathanv.pages.CheckoutPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import java.util.List;
import java.util.Map;

public class CheckoutStep {

    @Page
    private CheckoutPage checkoutPage;

    @Step
    public void hacerCheckOut(Map<String, String> datosCheckout) {
        checkoutPage.realizarCheckout();
        checkoutPage.ingresarNombre(datosCheckout.get("nombre"));
        checkoutPage.ingresarApellido(datosCheckout.get("apellido"));
        checkoutPage.ingresarCodigoPostal(datosCheckout.get("postal"));
        checkoutPage.continuarCheckout();
        checkoutPage.finalizarCheckout();
    }
}
