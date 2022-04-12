//PAGEFACTORY

package group1_art;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

public class Dataprovider3 {
	static WebDriver driver;
	@DataProvider(name = "login")
public String[][] getdata()
{
		String[][] data = new String[1][2];
		data[0][0] = "abcdef202122@gmail.com";
		data[0][1] = "abcdef";
		
		return data;
}
	
	
  @Test(dataProvider = "login")
  public void login(String email, String password) {
	  WebDriverManager.chromedriver().setup();
	  try {
		  driver = new ChromeDriver();
		  driver.get("https://demo.opencart.com/");
		  
		  lofinPage2 login = PageFactory.initElements(driver, lofinPage2.class);
		  
		  login.clickMyAccount();
		  login.clickLoginLink();
		  login.userName(email);
		  login.password(password);
		  login.logButton();
		  
		//click on 'my account'
			/*driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
				
			driver.findElement(By.linkText("Login")).click();
			driver.findElement(By.id("input-email")).sendKeys(email);
			driver.findElement(By.id("input-password")).sendKeys(password);
			driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
			*/
	  }catch (Exception e) {
			e.printStackTrace();
		}
  }

  
  
}
