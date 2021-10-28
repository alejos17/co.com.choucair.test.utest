package co.com.choucair.test.utest.tasks;

import co.com.choucair.test.utest.userinterface.UtestRegisterStep3Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

public class RegisterStep3  implements Task {

    private String strComputer;
    private String strVersion;
    private String strLanguage;
    private String strMobileDevice;
    private String strModel;
    private String strOs;

    public RegisterStep3(String strComputer, String strVersion, String strLanguage, String strMobileDevice, String strModel, String strOs) {
        this.strComputer = strComputer;
        this.strVersion = strVersion;
        this.strLanguage = strLanguage;
        this.strMobileDevice = strMobileDevice;
        this.strModel = strModel;
        this.strOs = strOs;
    }

    public static RegisterStep3 the(String strComputer, String strVersion, String strLanguage, String strMobileDevice, String strModel, String strOs) {
        return Tasks.instrumented(RegisterStep3.class,strComputer,strVersion,strLanguage,strMobileDevice,strModel,strOs);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestRegisterStep3Page.CLICK_INPUT_COMPUTER),
                Enter.theValue(strComputer).into(UtestRegisterStep3Page.INPUT_COMPUTER).thenHit(Keys.RETURN),
                Click.on(UtestRegisterStep3Page.CLICK_INPUT_VERSION),
                Enter.theValue(strVersion).into(UtestRegisterStep3Page.INPUT_VERSION).thenHit(Keys.RETURN),
                Click.on(UtestRegisterStep3Page.CLICK_INPUT_LANGUAGE),
                Enter.theValue(strLanguage).into(UtestRegisterStep3Page.INPUT_LANGUAGE).thenHit(Keys.RETURN),
                Click.on(UtestRegisterStep3Page.CLICK_INPUT_MOBILEDEVICE),
                Enter.theValue(strMobileDevice).into(UtestRegisterStep3Page.INPUT_MOBILEDEVICE).thenHit(Keys.RETURN),
                Click.on(UtestRegisterStep3Page.CLICK_INPUT_MODEL),
                Enter.theValue(strModel).into(UtestRegisterStep3Page.INPUT_MODEL).thenHit(Keys.RETURN),
                Click.on(UtestRegisterStep3Page.CLICK_INPUT_OS),
                Enter.theValue(strOs).into(UtestRegisterStep3Page.INPUT_OS).thenHit(Keys.RETURN),
                Click.on(UtestRegisterStep3Page.NEXT_BUTTON)
        );
    }
}
