package co.com.choucair.certification.proyectoreto.tasks;

import co.com.choucair.certification.proyectoreto.userinterface.CrearCategoriaPage;
import co.com.choucair.certification.proyectoreto.userinterface.MenuPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CrearCategoria implements Task {

    private final String categoria;

    public CrearCategoria(String categoria) {
        this.categoria = categoria;
    }

    public static CrearCategoria the(String categoria) {
        return Tasks.instrumented(CrearCategoria.class,categoria);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MenuPage.MENU_BLOG),
                Click.on(MenuPage.SUBMENU_BLOGCATEGORIAS),
                WaitUntil.the(CrearCategoriaPage.BUTTON_ADD, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CrearCategoriaPage.BUTTON_ADD),
                Enter.theValue(categoria).into(CrearCategoriaPage.INPUT_COURSE),
                Enter.theValue("HạngmụcThửthách").into(CrearCategoriaPage.INPUT_VIETNAMITA),
                Enter.theValue("Категориязадачи").into(CrearCategoriaPage.INPUT_RUSO),
                Enter.theValue("فئة التحدي").into(CrearCategoriaPage.INPUT_ARABE),
                Enter.theValue("دسته بندی چالش ها").into(CrearCategoriaPage.INPUT_PERSA),
                Enter.theValue("Zorluk Kategorisi").into(CrearCategoriaPage.INPUT_TURCO),
                Enter.theValue("Catégorie de défi").into(CrearCategoriaPage.INPUT_FRANCES),
                Enter.theValue(categoria).into(CrearCategoriaPage.INPUT_ESPANOL),
                Enter.theValue("Herausforderungskategorie").into(CrearCategoriaPage.INPUT_ALEMAN),
                Scroll.to(CrearCategoriaPage.BUTTON_ADD2),
                Click.on(CrearCategoriaPage.BUTTON_ADD2));
    }
}
