package com.jonathanv.steps;

import com.jonathanv.pages.CarPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class CarStep {

    @Page
    private CarPage carPage;

    @Step
    public void eliminarProductoDelCarrito(){
        carPage.quitarProducto();
    }
}
