package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="F:\\ECLIPSE\\Cucumber_Framework\\src\\test\\resources\\Features\\Admin.feature",
glue="stepDefinations")

public class AdminRunner extends AbstractTestNGCucumberTests{

}
