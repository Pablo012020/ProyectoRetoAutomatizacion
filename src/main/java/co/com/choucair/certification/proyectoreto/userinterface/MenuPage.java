package co.com.choucair.certification.proyectoreto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenuPage extends PageObject {
    public static final Target MENU_BLOG = Target.the("Selecciona menú Blogs").located(By.xpath("//a[contains(text(),'Blog') and @href='#Blog']"));
    public static final Target SUBMENU_BLOGCATEGORIAS = Target.the("Selecciona submenú Blog Categories").located(By.xpath("//a[contains(text(),'Blog Categories')]"));
    public static final Target SUBMENU_POST = Target.the("Selecciona submenú Post").located(By.xpath("//a[contains(text(),'Post')]"));
}
