package co.com.choucair.test.utest.tasks;

import co.com.choucair.test.utest.model.UtestUserData;
import co.com.choucair.test.utest.userinterface.UtestRegisterStep3Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.choucair.test.utest.userinterface.UtestRegisterStep3Page.*;
import static net.serenitybdd.screenplay.actions.Click.*;
import static net.serenitybdd.screenplay.actions.Enter.*;

public class RegisterStep3  implements Task {

    private UtestUserData userData;

    public RegisterStep3(UtestUserData userData){
        this.userData = userData;
    }

    public static RegisterStep3 the(UtestUserData userData){
        return Tasks.instrumented(RegisterStep3.class, userData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                on(CLICK_INPUT_COMPUTER),
                theValue(userData.getStrComputer()).into(INPUT_COMPUTER).thenHit(Keys.RETURN),
                on(CLICK_INPUT_VERSION),
                theValue(userData.getStrVersion()).into(INPUT_VERSION).thenHit(Keys.RETURN),
                on(CLICK_INPUT_LANGUAGE),
                theValue(userData.getStrLanguage()).into(INPUT_LANGUAGE).thenHit(Keys.RETURN),
                on(CLICK_INPUT_MOBILEDEVICE),
                theValue(userData.getStrMobileDevice()).into(INPUT_MOBILEDEVICE).thenHit(Keys.RETURN),
                on(CLICK_INPUT_MODEL),
                theValue(userData.getStrModel()).into(INPUT_MODEL).thenHit(Keys.RETURN),
                on(CLICK_INPUT_OS),
                theValue(userData.getStrOs()).into(INPUT_OS).thenHit(Keys.RETURN),
                on(NEXT_BUTTON)
        );
    }
}
