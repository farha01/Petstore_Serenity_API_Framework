package api.runner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"}
        ,features = {"src/test/resources/features"}
        ,glue = {"api.definitions"}
        ,tags = {"@PetStoreNegitive,@PetStorePositive"}
)
public class CucumberTestSuite {}
