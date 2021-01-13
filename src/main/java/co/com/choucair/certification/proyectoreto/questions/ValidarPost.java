package co.com.choucair.certification.proyectoreto.questions;

import co.com.choucair.certification.proyectoreto.userinterface.CrearCategoriaPage;
import co.com.choucair.certification.proyectoreto.userinterface.CrearPostPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class ValidarPost implements Question<Boolean> {
    private final String post;
    public ValidarPost(String post) {
        this.post = post;
    }

    public static ValidarPost toThe(String post) {
        return new ValidarPost(post);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        actor.attemptsTo(WaitUntil.the(CrearPostPage.MSG_OK, isNotVisible()),
                Click.on(CrearCategoriaPage.BUTTON_SEARCH),
                Enter.theValue(post).into(CrearCategoriaPage.INPUT_PHRASE),
                Click.on(CrearCategoriaPage.BUTTON_GO));
        String nameCourse = Text.of(CrearPostPage.NOMBRE_POST).viewedBy(actor).asString();
        if (post.equals(nameCourse)){
            result=true;
        }else {
            result=false;
        }
        return result;
    }
}
