package automation;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Login {
	

	public static void main(String[] args) {
		
		//driver initialization
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//windows and link
		driver.get("https://eticket.railway.gov.bd/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("mobile_number")).sendKeys("01400065916");
		driver.findElement(By.id("password")).sendKeys("abcd1234");
		driver.findElement(By.className("login-form-submit-btn")).click();
		
		
	}
}
	

