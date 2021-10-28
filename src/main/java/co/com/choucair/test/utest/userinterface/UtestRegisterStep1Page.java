package co.com.choucair.test.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegisterStep1Page extends PageObject {

    public static final Target INPUT_FIRST_NAME = Target.the("Input to Name").located(By.id("firstName"));

    public static final Target INPUT_LAST_NAME = Target.the("Input to LastName").located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target.the("Input to email").located(By.id("email"));

    public static final Target SELECT_YEAR = Target.the("Select to year of birth").located(By.id("birthYear"));

    public static final Target SELECT_MONTH = Target.the("Select to month of birth").located(By.id("birthMonth"));

    public static final Target SELECT_DAY = Target.the("Select to day of birth").located(By.id("birthDay"));

    public static final Target NEXT_BUTTON = Target.the("Button to next, Register Step 2").located(By.xpath("//div[@class='form-group col-xs-12 text-right']//span[contains(text(),'Next: Location')]"));

}
