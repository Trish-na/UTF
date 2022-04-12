package group1_art1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab_6 {

	static WebDriver driver;
	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	try {
		driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://demo.opencart.com/");
		
		//click on 'my account'
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
				
		//select 'login'
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
		
		//login
		driver.findElement(By.name("email")).sendKeys("abcdef202122@gmail.com");
		driver.findElement(By.name("password")).sendKeys("abcdef");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		
		//components
		driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[3]/a")).click();
		driver.findElement(By.partialLinkText("Monitors")).click();
		WebElement test = driver.findElement(By.id("input-limit"));
		Select drpdwn = new Select(test);
		drpdwn.selectByVisibleText("25");
		
		//add 1st item
		//driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div[2]/div[2]/button[1]")).click();
		 //driver.findElement(By.linkText("Add to Cart")).click();
		 //specification
		 driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div[2]/div[1]/h4/a")).click();
		driver.findElement(By.linkText("Specification")).click();
		//add to wishlist
	     driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/div[1]/button[1]")).click();
	     boolean b = driver.getPageSource().contains("Success: You have added Apple Cinema 30\" to your wish list!");
	     if (b==true)
	    	 System.out.println("Verified!");
	     //search Mobile
	     driver.findElement(By.name("search")).sendKeys("Mobile");
	     driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
	     
	     
	        
	        
	}catch (Exception e) {
		e.printStackTrace();
	}
	}
}
