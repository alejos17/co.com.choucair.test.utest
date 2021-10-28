package co.com.choucair.test.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://utest.com/")
public class UtestPage extends PageObject {

    public static final Target JOIN_BUTTON = Target.the("Button to redirect register form").located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up'][contains(text(),'Join Today')]"));

}
