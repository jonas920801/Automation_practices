package com.jonathanv.runners;


import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"pretty"},
        features = "src/test/resources/features/eliminar_productos.feature",
        glue = "com.jonathanv.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class EliminarProductoRunner {
}
