package com.camilomabe.tasks;

import com.camilomabe.interactions.GoesLogin;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.Wait;
import net.thucydides.core.annotations.Step;

import static com.camilomabe.ui.LoginHomePage.*;
import static com.camilomabe.utils.Constants.WAIT_FOR;
import static com.camilomabe.utils.SessionVariables.USER;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

@AllArgsConstructor
public class EntersCredential implements Task {

    private final String user;
    private final String pass;

    @Override
    @Step("{0} goes to login on the website")
    public <T extends Actor> void performAs(T actor) {
        actor.remember(USER.toString(), user);
        actor.attemptsTo(GoesLogin.letsGo());
        actor.attemptsTo(Wait.until(the(TXT_USER), isPresent()).forNoLongerThan(WAIT_FOR).seconds());
        actor.attemptsTo(Enter.theValue(user).into(TXT_USER));
        actor.attemptsTo(Enter.theValue(pass).into(TXT_PASSWORD));
        actor.attemptsTo(Click.on(BTN_LOGIN));
    }

    public static Performable forLoginIn(String email, String pass) {
        return Tasks.instrumented(EntersCredential.class, email, pass);
    }
}