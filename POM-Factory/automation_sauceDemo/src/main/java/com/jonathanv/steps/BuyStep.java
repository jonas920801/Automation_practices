package com.jonathanv.steps;

import com.jonathanv.pages.BuyPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class BuyStep {

    @Page
    private BuyPage buyPage;

    @Step
    public void addToCarBackPack(){
        buyPage.buyBackpack();
    }

    @Step
    public void addToCarBikeLight(){
        buyPage.buyBikeLight();
    }

    @Step
    public void addToCarBoltShirt(){
        buyPage.buyBoldShirt();
    }

    @Step
    public void addToCarJacket(){
        buyPage.buyJacket();
    }

    @Step
    public void addToCarOnesie(){
        buyPage.buyLabsOnesie();
    }

    @Step
    public void addToCarTshirtRed(){
        buyPage.buyTshirtRed();
    }

}
