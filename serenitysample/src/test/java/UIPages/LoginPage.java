package UIPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

//@DefaultUrl("https://www.saucedemo.com")
public class LoginPage extends PageObject {

	public void doLogin() throws InterruptedException {
		$(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");

		$(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		//Thread.sleep(2000);
		$(By.xpath("//input[@id='login-button']")).sendKeys(Keys.ENTER);
		
	}

	public String accountPage() {
		return $(By.xpath("//span[contains(text(),'Products')]")).getText();

	}

}
