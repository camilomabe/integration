package com.camilomabe.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeUserPage {

    public static Target txtUserLogged(String user) {
        return Target.the("user logged").located(By.xpath("(//*[contains(text(),'" + user + "')][1])"));
    }

}