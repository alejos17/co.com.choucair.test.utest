package co.com.choucair.test.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegisterStep2Page extends PageObject {

    public static final Target INPUT_CITY = Target.the("Input the City").located(By.id("city"));

    public static final Target INPUT_ZIPCODE = Target.the("Input the Zip or Postal Code").located(By.id("zip"));

    public static final Target CLICK_INPUT_COUNTRY = Target.the("Click in span to activate").located(By.xpath("//div[@class='ui-select-match'][@placeholder='Select a country']"));

    public static final Target INPUT_COUNTRY = Target.the("Input the Country").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));

    public static final Target NEXT_BUTTON = Target.the("Button to next, Register Step 3").located(By.xpath("//div[@class='pull-right next-step']//span[contains(text(),'Next: Devices')]"));

}
