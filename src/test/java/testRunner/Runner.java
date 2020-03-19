package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",
glue= "stepDefinations",
tags= "@youtubeURL",
dryRun=false, //whether feater is having corresponding step D or not
plugin= {"pretty","html:target/myreport"}   //{for printing clear output,to generate html report}
		)

public class Runner {

}
