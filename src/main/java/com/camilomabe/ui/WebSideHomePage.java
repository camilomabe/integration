package com.camilomabe.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WebSideHomePage extends PageObject {

    public static final Target ICON_MY_ACCOUNT = Target.the("login").located(By.xpath("//div[@class='myaccount']"));

}
