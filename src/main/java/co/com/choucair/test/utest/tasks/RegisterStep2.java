package co.com.choucair.test.utest.tasks;

import co.com.choucair.test.utest.model.UtestUserData;
import co.com.choucair.test.utest.userinterface.UtestRegisterStep2Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.choucair.test.utest.userinterface.UtestRegisterStep2Page.*;
import static net.serenitybdd.screenplay.actions.Click.*;
import static net.serenitybdd.screenplay.actions.Enter.*;

public class RegisterStep2 implements Task {

    private UtestUserData userData;

    public RegisterStep2(UtestUserData userData){
        this.userData = userData;
    }

    public static RegisterStep2 the(UtestUserData userData){
        return Tasks.instrumented(RegisterStep2.class, userData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                on(CLICK_INPUT_COUNTRY),
                theValue(userData.getStrCountry()).into(INPUT_COUNTRY).thenHit(Keys.RETURN),
                theValue(userData.getStrCity()).into(INPUT_CITY),
                theValue(userData.getStrZipCode()).into(INPUT_ZIPCODE),
                on(NEXT_BUTTON)
        );
    }
}
