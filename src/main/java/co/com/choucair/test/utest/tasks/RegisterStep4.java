package co.com.choucair.test.utest.tasks;

import co.com.choucair.test.utest.model.UtestUserData;
import co.com.choucair.test.utest.userinterface.UtestRegisterStep4Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.test.utest.userinterface.UtestRegisterStep4Page.*;
import static net.serenitybdd.screenplay.actions.Click.*;
import static net.serenitybdd.screenplay.actions.Enter.*;

public class RegisterStep4 implements Task {

    private UtestUserData userData;

    public RegisterStep4(UtestUserData userData) {
        this.userData = userData;
    }

    public static RegisterStep4 the(UtestUserData userData){
        return Tasks.instrumented(RegisterStep4.class,userData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                theValue(userData.getStrPassword()).into(INPUT_PASSWORD),
                theValue(userData.getStrPassword()).into(INPUT_CONFIRM_PASSWORD),
                on(CHECK_STAYINFORMED),
                on(CHECK_UTEST_TERMS),
                on(CHECK_PRIVPOL),
                on(COMPLETE_BUTTON)
        );
    }
}
