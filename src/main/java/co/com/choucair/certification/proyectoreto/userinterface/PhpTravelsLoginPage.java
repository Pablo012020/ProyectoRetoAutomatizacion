package co.com.choucair.certification.proyectoreto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PhpTravelsLoginPage extends PageObject {
    public static final Target INPUT_USER = Target.the("Donde se escribe el usuario").located(By.xpath("(//input[@name='email'])[1]"));
    public static final Target INPUT_PASSWORD = Target.the("Donde se escribe la contraseña").located(By.xpath("(//input[@name='password'])[1]"));
    public static final Target ENTER_BUTTON = Target.the("Botón que confirma el login").located(By.xpath("//span[contains(text(),'Login')]"));
}
