package com.rentingcolombia.certification.proxywompi.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/card_tokenization.feature",
        glue = "com.rentingcolombia.certification.proxywompi.definitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        dryRun = false)
public class CardTokenizationRunner {
}
