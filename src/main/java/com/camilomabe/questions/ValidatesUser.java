package com.camilomabe.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.camilomabe.ui.HomeUserPage.txtUserLogged;
import static com.camilomabe.utils.SessionVariables.USER;

public class ValidatesUser implements Question<String> {

    public static Question<String> displayed() {
        return new ValidatesUser();
    }

    @Override
    public String answeredBy(Actor actor) {
        return txtUserLogged(actor.recall(USER.toString())).resolveFor(actor).getText();
    }
}