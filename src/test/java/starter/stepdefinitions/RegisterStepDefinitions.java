package starter.stepdefinitions;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.UI.HomePage;
import starter.UI.PersonalPage;
import starter.navigation.NavigateTo;
import starter.questions.texto;
import starter.registerTask.DoRegister;
import starter.search.SearchResult;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasSize;

public class RegisterStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("(.*) doesn't have an account")
    public void actor_doesn_t_have_an_account(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.UtestGoHomePage(), WaitUntil.angularRequestsHaveFinished());

    }

    @When("he complete the form")
    public void he_complete_the_form() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(HomePage.BECOME_UTESTER),
                WaitUntil.angularRequestsHaveFinished(),
                DoRegister.Regis());
    }

    @Then("should be registered")
    public void should_be_registered() {
        theActorInTheSpotlight().should(
                seeThat("Welcome to the world's largest community of freelance software testers!", texto.description(PersonalPage.TITLE_REGISTERED)));
    }
}
