package group1_art;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class lofinPage2 {

	WebDriver driver;
	
	@FindBy (css = "a[title=\"My Account\"]") WebElement myaccount;
	//By myaccount = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a");
	
	//By loginlink = By.linkText("Login");
	@FindBy (linkText = "Login") WebElement loginlink;
	
	//By username = By.id("input-email");
	@FindBy(id = "input-email") WebElement username;
	
	//By password = By.id("input-password");
	@FindBy(id = "input-password") WebElement password;
	
	//By loginbutton = By.cssSelector("input[value=\"Logib\"]");
	@FindBy(css = "input[value=\"Login\"]") WebElement loginbutton;
	
	public lofinPage2(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void clickMyAccount()
	{
		//driver.findElement(myaccount).click();
		myaccount.click();
	}
	
	public void clickLoginLink()
	{
		//driver.findElement(loginlink).click();
		loginlink.click();
	}
	
	public void userName(String uname) {
		//driver.findElement(username).sendKeys(uname);
		username.sendKeys(uname);
	}
	
	public void password(String pword) {
		//driver.findElement(password).sendKeys(pword);
		password.sendKeys(pword);
	}
	
	public void logButton() {
		//driver.findElement(loginbutton).click();
		loginbutton.click();
	}
}
