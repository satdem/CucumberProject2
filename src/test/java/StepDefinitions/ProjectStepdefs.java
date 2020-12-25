package StepDefinitions;

import Pages.ProjectPom;
import Utilities.Driver;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ProjectStepdefs {
    WebDriver driver;
    @Given("^Navigate to basqar$")
    public void navigateToBasqar() {

        driver = Driver.getDriver();
        driver.get("http://zero.webappsecurity.com/login.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    ProjectPom projectPom=new ProjectPom();


    @When("^Enter username and password and click Login button$")
    public void enterUsernameAndPasswordAndClickLoginButton() {


        projectPom.findElementAndSendKeysFunction("loginButton","username ");
        projectPom.findElementAndSendKeysFunction("password","password");
        projectPom.findElementAndClickFunction("signInButton");




    }

    @Then("^Click on paybills and click on Add new Payee$")
    public void clickOnPaybillsAndClickOnAddNewPayee(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);

        for(int i=0;i<elementsToClick.size();i++) {

            System.out.println(elementsToClick.get(i));
            projectPom.findElementAndClickFunction(elementsToClick.get(i));
        }

    }

    @When("^Payying bills$")
    public void payyingBills(DataTable elements) {
        List< List<String> >  elementsNameAndValue = elements.asLists(String.class);

        for(int i=0;i<elementsNameAndValue.size();i++) {

            projectPom.findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0), elementsNameAndValue.get(i).get(1));

        }
    }

    @Then("^User should login successfully$")
    public void userShouldLoginSuccessfully(DataTable elements) {
        List<String> elementsToClick = elements.asList(String.class);

        for(int i=0;i<elementsToClick.size();i++) {

            projectPom.setControlMsj(elementsToClick.get(i),elementsToClick.get(1));
        }

    }
}
