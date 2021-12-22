package co.com.choucair.test.utest.questions;

import co.com.choucair.test.utest.model.UtestUserData;
import co.com.choucair.test.utest.userinterface.UtestRegisterCompletedPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.test.utest.userinterface.UtestRegisterCompletedPage.*;

public class Answer implements Question<Boolean> {

    private UtestUserData userData;

    public Answer(UtestUserData userData) {
        this.userData = userData;
    }

    public static Answer toThe(UtestUserData userData) {
        return new Answer(userData);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String CompletedMessage= Text.of(CONFIRM_REGISTRATION).viewedBy(actor).asString();
        if(userData.getStrMessage().equals(CompletedMessage)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
