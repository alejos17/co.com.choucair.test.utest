package co.com.choucair.test.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegisterStep3Page extends PageObject {

    public static final Target CLICK_INPUT_COMPUTER = Target.the("Click in span to activate").located(By.xpath("//div[@class='ui-select-match'][@placeholder='Select OS']"));
    public static final Target INPUT_COMPUTER = Target.the("Input the Computer Operating System").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));

    public static final Target CLICK_INPUT_VERSION = Target.the("Click in span to activate").located(By.xpath("//div[@class='ui-select-match'][@placeholder='Select a Version']"));
    public static final Target INPUT_VERSION = Target.the("Input the Computer Operating System").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));

    public static final Target CLICK_INPUT_LANGUAGE = Target.the("Click in span to activate").located(By.xpath("//div[@class='ui-select-match'][@placeholder='Select OS language']"));
    public static final Target INPUT_LANGUAGE = Target.the("Input the Computer Operating System").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));

    public static final Target CLICK_INPUT_MOBILEDEVICE = Target.the("Click in span to activate").located(By.xpath("//div[@class='ui-select-match'][@placeholder='Select Brand']"));
    public static final Target INPUT_MOBILEDEVICE = Target.the("Input the Computer Operating System").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));

    public static final Target CLICK_INPUT_MODEL = Target.the("Click in span to activate").located(By.xpath("//div[@class='ui-select-match'][@placeholder='Select a Model']"));
    public static final Target INPUT_MODEL = Target.the("Input the Computer Operating System").located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));

    public static final Target CLICK_INPUT_OS = Target.the("Click in span to activate").located(By.name("handsetOSId"));
    public static final Target INPUT_OS = Target.the("Input the Computer Operating System").located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));

    public static final Target NEXT_BUTTON = Target.the("Button to next, Register Step 2").located(By.xpath("//div[@class='pull-right next-step']//span[contains(text(),'Next: Last Step')]"));

}
