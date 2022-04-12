package group1_art1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class aleart1 {

	static WebDriver driver;
	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	try {
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Alert alert = driver.switchTo().alert();
		
		String atext = alert.getText();
		System.out.println("Alert message" + atext);
		Thread.sleep(2000);
		alert.accept();
		
		
	}catch (Exception e) {
		e.printStackTrace();
	}

}

}
