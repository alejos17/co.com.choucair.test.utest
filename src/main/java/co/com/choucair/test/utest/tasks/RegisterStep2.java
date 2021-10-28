package co.com.choucair.test.utest.tasks;

import co.com.choucair.test.utest.userinterface.UtestRegisterStep2Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

public class RegisterStep2 implements Task {

    private String strCity;
    private String strZipCode;
    private String strCountry;

    public RegisterStep2(String strCity, String strZipCode, String strCountry) {
        this.strCity = strCity;
        this.strZipCode = strZipCode;
        this.strCountry = strCountry;
    }

    public static RegisterStep2 the(String strCity, String strZipCode, String strCountry) {
        return Tasks.instrumented(RegisterStep2.class,strCity,strZipCode,strCountry);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestRegisterStep2Page.CLICK_INPUT_COUNTRY),
                Enter.theValue(strCountry).into(UtestRegisterStep2Page.INPUT_COUNTRY).thenHit(Keys.RETURN),
                Enter.theValue(strCity).into(UtestRegisterStep2Page.INPUT_CITY),
                Enter.theValue(strZipCode).into(UtestRegisterStep2Page.INPUT_ZIPCODE),
                Click.on(UtestRegisterStep2Page.NEXT_BUTTON)
        );
    }
}
