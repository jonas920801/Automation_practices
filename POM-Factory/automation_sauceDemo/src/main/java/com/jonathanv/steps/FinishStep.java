package com.jonathanv.steps;

import com.jonathanv.pages.FinishPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class FinishStep {

    @Page
    private FinishPage finishPage;

    @Step
    public void finalizarCompra(){

        finishPage.finalizarCompra();

    }

}
