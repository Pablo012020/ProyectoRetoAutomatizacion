package co.com.choucair.certification.proyectoreto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CrearCategoriaPage extends PageObject {
    public static final Target BUTTON_ADD = Target.the("Botón de agregar para abrir formulario").located(By.xpath("(//button[contains(text(),'Add')])[1]"));
    public static final Target INPUT_COURSE = Target.the("Campo para ingresar nombre de la categoria a crear").located(By.xpath("(//input[@name='name'])[1]"));
    public static final Target BUTTON_ADD2 = Target.the("Botón para confirmar adición de categoria").located(By.xpath("(//button[contains(text(),'Add')])[2]"));
    public static final Target BUTTON_SEARCH = Target.the("Botón para buscar categoria").located(By.xpath("//a[contains(text(),'Search') and @class='xcrud-search-toggle btn btn-default']"));
    public static final Target INPUT_PHRASE = Target.the("Campo para ingresar nombre categoria").located(By.xpath("//input[@name='phrase']"));
    public static final Target BUTTON_GO = Target.the("Boton GO para buscar categoria").located(By.xpath("//a[contains(text(),'Go') and @class='xcrud-action btn btn-primary']"));
    public static final Target NOMBRE_CATEGORIES = Target.the("Extrae el nombre de la categoria").located(By.xpath("(//tr[@class='xcrud-row xcrud-row-0']//td)[3]"));
    public static final Target INPUT_VIETNAMITA = Target.the("Campo para valor de categoria en Vietnamita").located(By.xpath("(//input[@name='translated[vi][name]'])[1]"));
    public static final Target INPUT_RUSO = Target.the("Campo para valor de categoria en Ruso").located(By.xpath("(//input[@name='translated[ru][name]'])[1]"));
    public static final Target INPUT_ARABE = Target.the("Campo para valor de categoria en Arabe").located(By.xpath("(//input[@name='translated[ar][name]'])[1]"));
    public static final Target INPUT_PERSA = Target.the("Campo para valor de categoria en Persa").located(By.xpath("(//input[@name='translated[fa][name]'])[1]"));
    public static final Target INPUT_TURCO = Target.the("Campo para valor de categoria en Turco").located(By.xpath("(//input[@name='translated[tr][name]'])[1]"));
    public static final Target INPUT_FRANCES = Target.the("Campo para valor de categoria en Frances").located(By.xpath("(//input[@name='translated[fr][name]'])[1]"));
    public static final Target INPUT_ESPANOL = Target.the("Campo para valor de categoria en Español").located(By.xpath("(//input[@name='translated[es][name]'])[1]"));
    public static final Target INPUT_ALEMAN = Target.the("Campo para valor de categoria en Aleman").located(By.xpath("(//input[@name='translated[de][name]'])[1]"));
}
