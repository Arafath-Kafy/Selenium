package automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TitleAndUrl {
	public static void main(String[] args) {
		
		//driver initialization
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//windows and link
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		String ExpectedTitle = "Swag Labs";
		String ActualTitle = driver.getTitle();
	

		//Assertion
		Assert.assertEquals(ActualTitle, ExpectedTitle, "Conditions True");
		
		//URL test
		String ExpectedUrl = "https://www.saucedemo.com/";
		String ActualUrl = driver.getCurrentUrl();
		
		if(ActualUrl.equals (ExpectedUrl)) {
			System.out.println("URL Matched");
		}
		else {
			System.out.println("URL Didn't Matched");
		}
	

		//Assertion
		Assert.assertEquals(ActualUrl, ExpectedUrl, "Conditions True");
		
		
	}
	

}
