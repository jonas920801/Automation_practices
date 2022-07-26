package com.jonathanv.steps;

import com.jonathanv.pages.OrderPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class OrderStep {

    @Page
    private OrderPage orderPage;

    @Step
    public void ordenarProductosDescentemente(){orderPage.OrdenarDescentende();}
}
