package co.com.choucair.test.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegisterCompletedPage extends PageObject {

    public static final Target CONFIRM_REGISTRATION = Target.the("Check the text to Registration is Completed").located(By.xpath("//strong[contains(text(),\"As a new tester, we recommend that you follow these 3 steps to begin getting involved with uTest:\")]"));

}
