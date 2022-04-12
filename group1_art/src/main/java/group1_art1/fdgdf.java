package group1_art1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fdgdf {

	public static void main(String[] args) throws IOException 
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		
		TakesScreenshot sshot = ((TakesScreenshot)driver);
		File src1 = sshot.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./pic1.png");
		FileHandler.copy(src1,dest1);
		
		ExtentSparkReporter reporter = new ExtentSparkReporter("./TestReport.html");
		
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		ExtentTest test = extent.createTest("TC001-Search product");
		
		test.pass("Enter the product name");
		test.pass("Check the product is listed");
		test.pass("Add the product to the cart");
		
		ExtentTest test2 = extent.createTest("TC002-Payment");
		test2.pass("Navigate to the payment page");
		test2.fail("Payment failed", MediaEntityBuilder.createScreenCaptureFromPath("pic1.PNG").build());
		extent.flush();
		
		}
}
