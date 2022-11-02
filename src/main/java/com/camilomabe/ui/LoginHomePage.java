package com.camilomabe.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginHomePage extends PageObject {

    public static final Target TXT_USER = Target.the("user").located(By.name("username"));
    public static final Target TXT_PASSWORD = Target.the("pass").located(By.name("password"));
    public static final Target  BTN_LOGIN = Target.the("login").located(By.name("login"));

}