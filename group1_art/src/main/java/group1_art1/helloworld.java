package group1_art1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class helloworld {
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		try {
			driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			
			WebElement element = driver.findElement(By.name("q"));
			element.sendKeys("What is selenium");
			element.submit();
			System.out.println("The page title is:" + driver.getTitle());
			driver.quit();
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
