package starter.registerTask;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitUntilAngularIsReady;
import org.openqa.selenium.Keys;
import starter.UI.PersonalPage;
import starter.model.ModelTask;
import starter.model.formRegister;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoRegister implements Task {

    public DoRegister() {
    }

    public static Performable Regis(){
        return instrumented(DoRegister.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        formRegister formRegister2 = new formRegister();
        ModelTask modelTask = new ModelTask();
        modelTask.getformRegister(formRegister2);

        actor.attemptsTo(
                Enter.theValue(formRegister2.getF_name()).into(PersonalPage.FIRST_NAME),
                Enter.theValue(formRegister2.getL_name()).into(PersonalPage.LAST_NAME),
                Enter.theValue(formRegister2.getAddress()).into(PersonalPage.EMAIL),
                SelectFromOptions.byVisibleText("July").from(PersonalPage.BIRTH_MONTH),
                SelectFromOptions.byVisibleText("3").from(PersonalPage.BIRTH_DAY),
                SelectFromOptions.byVisibleText("1997").from(PersonalPage.BIRTH_YEAR),
                Click.on(PersonalPage.BOTON_NEXT),
                WaitUntil.angularRequestsHaveFinished(),
                Enter.theValue(formRegister2.getCity()).into(PersonalPage.CITY),
                Hit.the(Keys.ARROW_DOWN).into(PersonalPage.CITY),
                Hit.the(Keys.ENTER).into(PersonalPage.CITY),
                Enter.theValue(formRegister2.getZip_code()).into(PersonalPage.ZIP_CODE),
                Click.on(PersonalPage.BOTON_NEXT),
                WaitUntil.angularRequestsHaveFinished(),
                Click.on(PersonalPage.SELECT_VERSION),
                Enter.theValue("Ubuntu").into(PersonalPage.INPUT_VERSION),
                Hit.the(Keys.ENTER).into(PersonalPage.INPUT_VERSION),
                Click.on(PersonalPage.SELECT_LENGUAGE),
                Enter.theValue("Spanish").into(PersonalPage.INPUT_LENGUAGE),
                Hit.the(Keys.ENTER).into(PersonalPage.INPUT_LENGUAGE),
                Click.on(PersonalPage.SELECT_MOBILE),
                Enter.theValue("Apple").into(PersonalPage.INPUT_MOBILE),
                Hit.the(Keys.ENTER).into(PersonalPage.INPUT_MOBILE),
                Click.on(PersonalPage.SELECT_MODEL),
                Enter.theValue("iPhone 4").into(PersonalPage.INPUT_MODEL),
                Hit.the(Keys.ENTER).into(PersonalPage.INPUT_MODEL),
                Click.on(PersonalPage.SELECT_SYSTEM),
                Enter.theValue("iOS 11.2").into(PersonalPage.INPUT_SYSTEM),
                Hit.the(Keys.ENTER).into(PersonalPage.INPUT_SYSTEM),
                Click.on(PersonalPage.BOTON_NEXT),
                WaitUntil.angularRequestsHaveFinished(),
                Enter.theValue(formRegister2.getPass()).into(PersonalPage.PASS),
                Enter.theValue(formRegister2.getPass()).into(PersonalPage.CONF_PASS),
                Click.on(PersonalPage.CHECK_TERMS),
                Click.on(PersonalPage.CHECK_PRIVACITY),
                Click.on(PersonalPage.BOTON_NEXT),
                WaitUntil.angularRequestsHaveFinished()
                );

    }
}
