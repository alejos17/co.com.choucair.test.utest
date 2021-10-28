package co.com.choucair.test.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegisterCompletedPage extends PageObject {

    public static final Target CONFIRM_REGISTRATION = Target.the("Check the text to Registration is Completed").located(By.xpath("//p[@class='welcome-lead'][contains(text(),'We are excited that you have found your way to uTest - home of the largest community of digital freelance software testers in the world!')]"));

}
