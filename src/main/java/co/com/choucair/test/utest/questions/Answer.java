package co.com.choucair.test.utest.questions;

import co.com.choucair.test.utest.userinterface.UtestRegisterCompletedPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    private String strMessage;

    public Answer(String strMessage) {
        this.strMessage = strMessage;
    }

    public static Answer toThe(String strMessage) {
        return new Answer(strMessage);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String CompletedMessage= Text.of(UtestRegisterCompletedPage.CONFIRM_REGISTRATION).viewedBy(actor).asString();
        System.out.println("Mensaje Esperado"+ strMessage);
        System.out.println("Mensaje Capturado" +CompletedMessage);
        if(strMessage.equals(CompletedMessage)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
