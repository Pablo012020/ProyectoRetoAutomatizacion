package co.com.choucair.certification.proyectoreto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CrearPostPage extends PageObject {
    public static final Target INPUT_TITTLE = Target.the("Campo para ingresar titulo del post").located(By.xpath("//input[@name='title']"));
    public static final Target INPUT_PERMALINK = Target.the("Campo para ingresar Permalink del Post").located(By.xpath("//input[@name='slug']"));
    public static final Target SELECT_STATUS = Target.the("Selección de status en el post").located(By.xpath("//select[@name='status']"));
    public static final Target SELECT_CATEGORY = Target.the("Selección de categoria en el post").located(By.xpath("//select[@name='category']"));
    public static final Target INPUT_ARTICULO = Target.the("Campo para ingresar articulo relacionado").located(By.xpath("//input[@id='s2id_autogen2']"));
    public static final Target SELECT_ARTICULO = Target.the("Selección de articulo relacionado").located(By.xpath("//div[contains(text(),'Where to Eat in Rome During Holidays')]"));
    public static final Target BUTTON_MINIATURA =Target.the("Selección de imagen minuatura para el post").located(By.xpath("//input[@id='image_default']"));
    public static final Target INPUT_KEYWORDS =Target.the("Campo para ingresar palabras claves").located(By.xpath("//input[@name='keywords']"));
    public static final Target INPUT_DESCRIPTION =Target.the("Campo para ingresar una descripción").located(By.xpath("//input[@name='metadesc']"));
    public static final Target BUTTON_ENVIAR = Target.the("Enviar post").located(By.xpath("//button[contains(text(),'Submit')]"));
    public static final Target INPUT_POST = Target.the("Campo para editar post").located(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']//p"));
    public static final Target NOMBRE_POST = Target.the("Extrae en nombre del Post").located(By.xpath("(//tr[@class='xcrud-row xcrud-row-0']//td)[4]"));
    public static final Target MSG_OK = Target.the("Esperaa mensaje de confimación Post").located(By.xpath("//h4[contains(text(),'Changes Saved!')]"));
}
