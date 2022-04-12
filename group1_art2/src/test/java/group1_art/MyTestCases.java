package group1_art;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyTestCases {
  
	WebDriver driver;
	By myaccount = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a");
	By loginlink = By.linkText("Login");
	By username = By.id("input-email");
	By password = By.id("input-password");
	By loginbutton = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
	
	@FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[1]/a" )WebElement desktops;
	@FindBy(linkText = "Mac (1)" )WebElement mac;
	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div/div[2]/div[2]/button[1]")WebElement addToCart;
	@FindBy(linkText = "Tablets" )WebElement tablets;
	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[4]/a" )WebElement cart;
	@FindBy(linkText = "Checkout")WebElement checkout;
	
	public void clickdesktop()
	{
		desktops.click();
	}

	public void clickmac()
	{
		mac.click();
	}

	public void cliccart()
	{
		cart.click();
	}

	public void clickadd() {
		addToCart.click();
	}
	public void clicktablets() {
		tablets.click();
	}
	public void clickcheckout() {
		checkout.click();
	}
	
	public MyTestCases(WebDriver driver)
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
