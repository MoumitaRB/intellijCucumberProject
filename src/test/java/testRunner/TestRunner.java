package testRunner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C://IdeaProjects//SeleniumCucumber//Features//OrangeHRMTagging.feature",
        glue= "stepDefinition",
        dryRun=false,
        //features="@target/rerun.txt",

       // tags = {"@Sanity"}  ,//only sanity testing
       //tags={"@Sanity","@Regression"} ,  //sanity AND regression testing
        // tags={"@Sanity,@Regression"},      //Sanity or Regression testing
       tags= {"@End2End","~@Sanity","~@Regression"},

       plugin ={"pretty","html:test-output",
               "json:jason_output",
              "junit:junit_xml_output/cucumber.xml"}
         //        "rerun:target/rerun.txt"}
)

public class TestRunner {


}
