package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target CARD_UNIVERSITY = Target.the("clic en button search to navbar").located(By.xpath("//div[@id='universidad']//strong"));
    public static final Target INPUT_COURSE = Target.the("search the course").located(By.id("coursesearchbox"));
    public  static final Target BUTTON_GO = Target.the("button action for serach").located(By.id("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("select the course").located(By.xpath("//h4[contains(text(),'Recursos Automatización Bancolombia')]"));
    public static final Target NAME_COURSE = Target.the("extract name the course").located(By.xpath("h1[contains(text(),'Recursos Automatización Bancolombia')]"));

}
