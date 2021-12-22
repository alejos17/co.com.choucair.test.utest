package co.com.choucair.test.utest.tasks;

import co.com.choucair.test.utest.model.UtestUserData;
import co.com.choucair.test.utest.userinterface.UtestRegisterStep1Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.choucair.test.utest.userinterface.UtestRegisterStep1Page.*;
import static net.serenitybdd.screenplay.actions.Enter.*;
import static net.serenitybdd.screenplay.actions.SelectFromOptions.byVisibleText;

public class RegisterStep1 implements Task {

    private UtestUserData userData;

    public RegisterStep1(UtestUserData userData){
        this.userData = userData;
    }

    public static RegisterStep1 the(UtestUserData userData){
        return Tasks.instrumented(RegisterStep1.class, userData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                theValue(userData.getStrName()).into(INPUT_FIRST_NAME),
                theValue(userData.getStrLastName()).into(INPUT_LAST_NAME),
                theValue(userData.getStrEmail()).into(INPUT_EMAIL),
                byVisibleText(userData.getStrYearOfBirth()).from(SELECT_YEAR),
                byVisibleText(userData.getStrMonthOfBirth()).from(SELECT_MONTH),
                byVisibleText(userData.getStrDayOfBirth()).from(SELECT_DAY),
                Click.on(NEXT_BUTTON)
        );
    }
}
