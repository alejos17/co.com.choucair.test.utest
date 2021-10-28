package co.com.choucair.test.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegisterStep4Page extends PageObject {

    public static final Target INPUT_PASSWORD = Target.the("Input to Create Password").located(By.id("password"));

    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Input to Confirm the Password").located(By.id("confirmPassword"));

    public static final Target CHECK_STAYINFORMED = Target.the("Check to Stay Informed").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label/span"));

    public static final Target CHECK_UTEST_TERMS = Target.the("Check to accept the Utest Terms and Code Conduct").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target CHECK_PRIVPOL = Target.the("Check to accept the Privacy Policy").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target COMPLETE_BUTTON = Target.the("Button to Complete Setup").located(By.xpath("//div[@class='pull-right next-step']//span[contains(text(),'Complete Setup')]"));

}
