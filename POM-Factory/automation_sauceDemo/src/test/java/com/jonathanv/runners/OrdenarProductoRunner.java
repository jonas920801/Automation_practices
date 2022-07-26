package com.jonathanv.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"pretty"},
        features = "src/test/resources/features/ordenar_productos.feature",
        glue = "com.jonathanv.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class OrdenarProductoRunner {
}
