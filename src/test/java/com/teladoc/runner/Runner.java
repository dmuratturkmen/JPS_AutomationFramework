package com.teladoc.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"pretty",
                "html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target\\rerun.txt"
        },
        features = "src\\test\\resources\\features",
        glue = "com\\teladoc\\steps",
        dryRun = false,
        monochrome = true,
        tags = " "
)

public class Runner {
}
