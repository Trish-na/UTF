package group1_art;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class lofinPage {

	WebDriver driver;
	By myaccount = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a");
	By loginlink = By.linkText("Login");
	By username = By.id("input-email");
	By password = By.id("input-password");
	By loginbutton = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
	
	public lofinPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void clickMyAccount()
	{
		driver.findElement(myaccount).click();
	}
	
	public void clickLoginLink()
	{
		driver.findElement(loginlink).click();
	}
	
	public void userName(String uname) {
		driver.findElement(username).sendKeys(uname);
	}
	
	public void password(String pword) {
		driver.findElement(password).sendKeys(pword);
	}
	
	public void logButton() {
		driver.findElement(loginbutton).click();
	}
}
