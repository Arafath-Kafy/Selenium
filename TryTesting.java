package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TryTesting {
	

	public static void main(String[] args) throws InterruptedException {
		
		//driver initialization
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//windows and link
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		
		//name
		driver.findElement(By.id("fname")).sendKeys("Arafath");
		driver.findElement(By.id("lname")).sendKeys("Kafy");
		Thread.sleep(2000);
		
		//radio button
		WebElement radiobutton= driver.findElement(By.id("male"));
		radiobutton.click();
		Thread.sleep(1000);
		
		//drop down list
		WebElement testDropDown= driver.findElement(By.id("option"));
		Select dropdown = new Select(testDropDown);
		dropdown.selectByIndex(1);
		assert testDropDown.isSelected();
		Thread.sleep(2000);
		
		//check list
		WebElement checklist = driver.findElement(By.name("option2"));
		checklist.click();
		assert checklist.isSelected();
		Thread.sleep(1000);
		
		WebElement checklist1 = driver.findElement(By.name("option3"));
		checklist1.click();
		assert checklist1.isSelected();
		Thread.sleep(1000);
		
		//photo
		WebElement fileupload = driver.findElement(By.id("myfile"));
		String filePath = "C:\\Users\\Admin\\Desktop\\129007.png";
	    fileupload.sendKeys(filePath);
	    Thread.sleep(2000);
	    
	    //submit
	    driver.findElement(By.className("btn-success")).click();

	}
}
