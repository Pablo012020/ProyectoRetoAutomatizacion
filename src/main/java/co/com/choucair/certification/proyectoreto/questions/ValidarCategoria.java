package co.com.choucair.certification.proyectoreto.questions;

import co.com.choucair.certification.proyectoreto.userinterface.CrearCategoriaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidarCategoria implements Question<Boolean> {
    private final String categoria;
    public ValidarCategoria(String categoria) {
        this.categoria = categoria;
    }

    public static ValidarCategoria toThe(String categoria) {
        return new ValidarCategoria(categoria);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        actor.attemptsTo(Click.on(CrearCategoriaPage.BUTTON_SEARCH),
                Enter.theValue(categoria).into(CrearCategoriaPage.INPUT_PHRASE),
                Click.on(CrearCategoriaPage.BUTTON_GO),
                WaitUntil.the(CrearCategoriaPage.NOMBRE_CATEGORIES,isVisible()).forNoMoreThan(10).seconds());
        String nameCourse = Text.of(CrearCategoriaPage.NOMBRE_CATEGORIES).viewedBy(actor).asString();
        if (categoria.equals(nameCourse)){
            result=true;
        }else {
            result=false;
        }
        return result;
    }
}
