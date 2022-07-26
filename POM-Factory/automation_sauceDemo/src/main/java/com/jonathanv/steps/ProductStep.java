package com.jonathanv.steps;

import com.jonathanv.pages.ProductsPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class ProductStep {

    @Page
    private ProductsPage productsPage;

    @Step
    public void agregarProductoCarrito() {
        productsPage.agregaCarrito();
    }

        @Step
        public void irHaciaCarrito() {
            productsPage.clicCarrito();

        }

}
