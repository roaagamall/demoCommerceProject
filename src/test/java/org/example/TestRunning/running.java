package org.example.TestRunning;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import net.bytebuddy.implementation.bind.annotation.RuntimeType;


@CucumberOptions(
        features = "src/main/resources/Features",
        glue ="org.example.stepDefinition",
        tags ="@smoke",
        plugin =  { "pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cukes.xml",
                "rerun:target/rerun.txt"}

        )

public class running extends AbstractTestNGCucumberTests {
}
