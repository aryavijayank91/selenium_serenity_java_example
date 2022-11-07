package steps;

import org.junit.Assert;

import UIPages.LoginPage;
	
import net.thucydides.core.annotations.Step;

public class LoginPageSteps {
	
	private LoginPage loginPage;
@Step
public void onLoginPage() {
	loginPage.open();
}
@Step
public void addUser() throws InterruptedException {
	loginPage.doLogin();
}

@Step
public void userShouldLogin() {
	Assert.assertTrue(loginPage.accountPage().equals("PRODUCTS"));
}
}
