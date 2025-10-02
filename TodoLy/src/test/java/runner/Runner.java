package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import pages.PaginaPrincipal;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps",
        plugin = {"pretty","html:target/cucumber-reports.html"}
)


public class Runner {

    @AfterClass
    public static void cleanDriver(){
        PaginaPrincipal.closeBrower();
    }
}
