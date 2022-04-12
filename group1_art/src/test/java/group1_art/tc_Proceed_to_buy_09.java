package group1_art;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tc_Proceed_to_buy_09 {
	
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
  		
  		  tc.clicktablets();
		  tc.clickadd();
  		  
  		  tc.cliccart();
  		  tc.clickcheckout();
  		  //tc.checkerror();
  		TakesScreenshot sshot = ((TakesScreenshot)driver);
		File src1 = sshot.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./pic2.png");
		FileHandler.copy(src1,dest1);
		
		ExtentSparkReporter reporter = new ExtentSparkReporter("./TestReport8.html");
		
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		ExtentTest test2 = extent.createTest("TC09-Verification of cart count");
		test2.pass("Check the product is listed");
  		  
  }catch (Exception e) {
  	e.printStackTrace();
  }
  	  
  }
  
  
}