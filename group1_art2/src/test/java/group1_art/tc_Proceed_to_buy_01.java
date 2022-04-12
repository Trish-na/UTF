package group1_art;

import java.io.File;
import java.io.IOException;

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
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tc_Proceed_to_buy_01 {
	

	public static void main(String[] args) throws IOException 
	{
		
		

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=checkout/cart");
		
		TakesScreenshot sshot = ((TakesScreenshot)driver);
		File src1 = sshot.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./pic1.png");
		FileHandler.copy(src1,dest1);
		
		ExtentSparkReporter reporter = new ExtentSparkReporter("./ProjectReport.html");
		
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(reporter);
	}
}
