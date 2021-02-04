package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON),
                Enter.theValue("1232407755").into(ChoucairLoginPage.INPUT_USERNAME),
                Enter.theValue("Choucair2021*").into(ChoucairLoginPage.INPUT_PASS),
                Click.on(ChoucairLoginPage.ACTION_LOGIN)
        );
    }
}
