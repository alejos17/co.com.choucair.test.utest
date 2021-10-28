package co.com.choucair.test.utest.tasks;

import co.com.choucair.test.utest.userinterface.UtestRegisterStep1Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

public class RegisterStep1 implements Task {

    private String strName;
    private String strLastName;
    private String strEmail;
    private String strYearOfBirth;
    private String strMonthOfBirth;
    private String strDayOfBirth;

    public RegisterStep1(String strName, String strLastName, String strEmail, String strYearOfBirth, String strMonthOfBirth, String strDayOfBirth) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strYearOfBirth = strYearOfBirth;
        this.strMonthOfBirth = strMonthOfBirth;
        this.strDayOfBirth = strDayOfBirth;
    }

    public static RegisterStep1 the(String strName, String strLastName, String strEmail, String strYearOfBirth, String strMonthOfBirth, String strDayOfBirth) {
        return Tasks.instrumented(RegisterStep1.class,strName,strLastName,strEmail,strYearOfBirth,strMonthOfBirth,strDayOfBirth);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strName).into(UtestRegisterStep1Page.INPUT_FIRST_NAME),
                Enter.theValue(strLastName).into(UtestRegisterStep1Page.INPUT_LAST_NAME),
                Enter.theValue(strEmail).into(UtestRegisterStep1Page.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(strYearOfBirth).from(UtestRegisterStep1Page.SELECT_YEAR),
                SelectFromOptions.byVisibleText(strMonthOfBirth).from(UtestRegisterStep1Page.SELECT_MONTH),
                SelectFromOptions.byVisibleText(strDayOfBirth).from(UtestRegisterStep1Page.SELECT_DAY),
                Click.on(UtestRegisterStep1Page.NEXT_BUTTON)
        );
    }
}
