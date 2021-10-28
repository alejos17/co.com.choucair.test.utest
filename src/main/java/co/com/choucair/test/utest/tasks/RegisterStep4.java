package co.com.choucair.test.utest.tasks;

import co.com.choucair.test.utest.userinterface.UtestRegisterStep4Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

public class RegisterStep4 implements Task {

    private String strPassword;

    public RegisterStep4(String strPassword) {
        this.strPassword = strPassword;
    }

    public static RegisterStep4 the(String strPassword){
        return Tasks.instrumented(RegisterStep4.class,strPassword);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strPassword).into(UtestRegisterStep4Page.INPUT_PASSWORD),
                Enter.theValue(strPassword).into(UtestRegisterStep4Page.INPUT_CONFIRM_PASSWORD),
                Click.on(UtestRegisterStep4Page.CHECK_STAYINFORMED),
                Click.on(UtestRegisterStep4Page.CHECK_UTEST_TERMS),
                Click.on(UtestRegisterStep4Page.CHECK_PRIVPOL),
                Click.on(UtestRegisterStep4Page.COMPLETE_BUTTON)
        );
    }
}
