package co.com.choucair.test.utest.tasks;

import co.com.choucair.test.utest.userinterface.UtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterRegister implements Task {

    public static EnterRegister onThePage() {
        return Tasks.instrumented(EnterRegister.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestPage.JOIN_BUTTON));
    }
}
