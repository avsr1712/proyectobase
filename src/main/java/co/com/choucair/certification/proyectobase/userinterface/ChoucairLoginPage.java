package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class ChoucairLoginPage extends PageObject {
   public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login").located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(), 'Ingresar')]"));
    public static final Target INPUT_USERNAME = Target.the("Input Username").located(By.id("username"));
    public static final Target INPUT_PASS = Target.the("Input Password").located(By.id("password"));
    public static final Target ACTION_LOGIN = Target.the("button for authenticate").located(By.xpath("//button[contains(@class,'btn btn-primary')]"));
}
