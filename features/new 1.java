import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "/home/coder/project/workspace/practice_1.feature" , 
glue = {"Amazon_StepDefinitions"},
format = {"/home/coder/project/workspace/practice_1/Amazon_StepDefinations.java"})
public class AmazonTestRunner {

}