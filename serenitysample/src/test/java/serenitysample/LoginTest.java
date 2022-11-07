package serenitysample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.pages.PageObject;
//import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import steps.LoginPageSteps;
@RunWith(SerenityRunner.class)
//@DefaultUrl("https://www.google.com")
public class LoginTest  extends PageObject{
	
	@Steps
	LoginPageSteps loginPageSteps;
	
	
	@Managed(driver="chrome")
	WebDriver driver;
	
	
	//@FindBy(name="q")
	//WebElement gg;
	@Title("Executing Login Test")
	@Test
	public void doLogin() throws InterruptedException {
	
loginPageSteps.onLoginPage();		
loginPageSteps.addUser();
loginPageSteps.userShouldLogin();
		
	//test code	
		//ChromeDriverManager.getInstance().setup();
//WebDriverManager.getInstance(CHROME).setup();
//driver.get("https://www.google.com");
		//WebDriverManager.chromedriver().browserVersion("105.0.5195.127").setup();
//WebDriverManager.chromedriver().setup();
		////ChromeOptions options = new ChromeOptions();
		//options.addArguments("start-maximized"); 
		////options.addArguments("enable-automation"); 
//		options.addArguments("--no-sandbox"); 
//		options.addArguments("--disable-infobars");
//		options.addArguments("--disable-dev-shm-usage");
//		options.addArguments("--disable-browser-side-navigation"); 
//		options.addArguments("--disable-gpu"); 
//		driver = new ChromeDriver(options); 
		//.open();
		//driver.get("https://www.google.com");
		//Thread.sleep(2000);
//driver = new ChromeDriver();
//;
//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
//driver.findElement(By.name("q")).sendKeys("hello");
//find(By.name("q")).sendKeys("hello");
//$(By.name("q")).sendKeys("hello");
//typeInto($(By.name("q")),("hello"));
//System.out.println(driver.getTitle());
//typeInto(gg,("hello"));

}
	
}