package co.com.choucair.certification.proyectoreto.tasks;

import co.com.choucair.certification.proyectoreto.userinterface.PhpTravelsLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login  implements Task {

    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("admin@phptravels.com").into(PhpTravelsLoginPage.INPUT_USER),
                Enter.theValue("demoadmin").into(PhpTravelsLoginPage.INPUT_PASSWORD),
                Click.on(PhpTravelsLoginPage.ENTER_BUTTON));
    }
}
