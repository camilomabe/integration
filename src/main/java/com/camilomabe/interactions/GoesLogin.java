package com.camilomabe.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.Wait;
import net.thucydides.core.annotations.Step;

import static com.camilomabe.ui.WebSideHomePage.ICON_MY_ACCOUNT;
import static com.camilomabe.utils.Constants.WAIT_FOR;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class GoesLogin implements Interaction {

    public static Performable letsGo() {
        return Tasks.instrumented(GoesLogin.class);
    }

    @Override
    @Step("{0} clicks on the login tag")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Wait.until(the(ICON_MY_ACCOUNT), isPresent()).forNoLongerThan(WAIT_FOR).seconds());
        actor.attemptsTo(Click.on(ICON_MY_ACCOUNT));
    }
}