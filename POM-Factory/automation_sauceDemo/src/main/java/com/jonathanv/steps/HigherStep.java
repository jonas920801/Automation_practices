package com.jonathanv.steps;

import com.jonathanv.pages.HigherPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class HigherStep {

    @Page
    HigherPage higherPage;

    @Step
    public void comprobarProductoMasCaro(){higherPage.primerProductoCaro();
    }

}
