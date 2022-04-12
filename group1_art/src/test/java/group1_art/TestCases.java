package group1_art;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCases {
	
	WebDriver driver;
  @Test
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
  		  
  		  MyTestCases tc = PageFactory.initElements(driver, MyTestCases.class);
  		  
  		  lofinPage login = new lofinPage(driver);
  		  
  		  login.clickMyAccount();
  		  login.clickLoginLink();
  		  login.userName(email);
  		  login.password(password);
  		  login.logButton();
  		
  		  tc.clickdesktop();
  		  tc.clickmac();
  		  tc.clickadd();
  		  tc.clicktablets();
  		  tc.clickadd();
  		  tc.cliccart();
  		  tc.clickcheckout();
  		  //tc.checkerror();
  		  
  }catch (Exception e) {
  	e.printStackTrace();
  }
  	  
  }
  
  
}
