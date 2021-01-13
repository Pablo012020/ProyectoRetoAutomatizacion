package co.com.choucair.certification.proyectoreto.tasks;

import co.com.choucair.certification.proyectoreto.userinterface.CrearCategoriaPage;
import co.com.choucair.certification.proyectoreto.userinterface.CrearPostPage;
import co.com.choucair.certification.proyectoreto.userinterface.MenuPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import java.io.File;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CrearPost implements Task {

    private final String post;
    private final String categoria;

    public CrearPost(String post, String categoria) {
        this.post = post;
        this.categoria = categoria;
    }

    public static CrearPost the(String post, String categoria) {
        return Tasks.instrumented(CrearPost.class,post,categoria);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        File file = new File("src/test/resources/images/post.jpg");
        actor.attemptsTo(Click.on(MenuPage.MENU_BLOG),
                Click.on(MenuPage.SUBMENU_POST),
                WaitUntil.the(CrearCategoriaPage.BUTTON_ADD, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CrearCategoriaPage.BUTTON_ADD),
                Enter.theValue(post).into(CrearPostPage.INPUT_TITTLE),
                Enter.theValue(post).into(CrearPostPage.INPUT_PERMALINK),
                SelectFromOptions.byVisibleText("Enable").from(CrearPostPage.SELECT_STATUS),
                SelectFromOptions.byVisibleText(categoria).from(CrearPostPage.SELECT_CATEGORY),
                Click.on(CrearPostPage.INPUT_ARTICULO),
                Click.on(CrearPostPage.SELECT_ARTICULO),
                Enter.keyValues(file.getAbsolutePath()).into(CrearPostPage.BUTTON_MINIATURA),
                Switch.toFrame(0),
                Enter.theValue("Post reto automatización").into(CrearPostPage.INPUT_POST),
                Switch.toParentFrame(),
                Enter.theValue("Viajar").into(CrearPostPage.INPUT_KEYWORDS),
                Enter.theValue("Viajar Con Pablo").into(CrearPostPage.INPUT_DESCRIPTION),
                Click.on(CrearPostPage.BUTTON_ENVIAR));
    }
}
