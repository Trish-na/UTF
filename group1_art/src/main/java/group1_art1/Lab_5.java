package group1_art1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab_5 {

	static WebDriver driver;
	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	try {
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		
		//verify the title 'YOUR STORE'
		boolean b = driver.getPageSource().contains("Your Store");
		if(b==true)
			System.out.println("Expected title is present");
		
		//click on 'my account'
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
		
		//select 'registration'
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();
		
		//verify 'Register account' page
		b = driver.getPageSource().contains("Register Account");
		if(b==true)
			System.out.println("Expected page is opened");
		
		//click 'continue' button
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
		
		//verify the 'warning'
		b = driver.getPageSource().contains(" Warning: You must agree to the Privacy Policy!");
		if(b==true)
			System.out.println("Expected message is present");
		
		//enter 'first name'
		driver.findElement(By.name("firstname")).sendKeys("33");
		
		//click 'continue' button
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
		
		//verify if first name '33' is displayed
		b = driver.findElement(By.name("firstname")).isDisplayed();
		if(b==true)
			System.out.println("The first name is displayed");
		else
			System.out.println("There is an error in displaying the first name");
		
		//enter 'last name'
		driver.findElement(By.name("lastname")).sendKeys("dey");
		
		//enter 'email'
		driver.findElement(By.name("email")).sendKeys("abcdef202122@gmail.com");
		
		//enter 'telephone' and verify it is a number and between 3 to 32
		WebElement numField = driver.findElement(By.name("telephone"));
		numField.sendKeys("878698750");
		String num = numField.getAttribute("value");
		
		/*
		 * if(num.equals("number")) System.out.println("Allowed"); else
		 * System.out.println("Only numbers are allowed"); 
		 */
		int size = num.length();
		if(size>3 && size<32)
			System.out.println("You can proceed");
		else
			System.out.println("The telephone nuber should be between 3 to 32");
		
		//enter 'password'
		driver.findElement(By.name("password")).sendKeys("abcdef");
		driver.findElement(By.name("confirm")).sendKeys("abcdef");
		
		//click on 'privacy policy checkbox'
		driver.findElement(By.name("agree")).click();
		
		//click 'continue' button
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
				
		//verify the title 'YOUR STORE'
		b = driver.getPageSource().contains("Your Account Has Been Created!");
		if(b==true)
			System.out.println("Expected msg is present");
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul[2]/li[1]/a")).click();
		
		
	}catch (Exception e) {
		e.printStackTrace();
	}

}
}
