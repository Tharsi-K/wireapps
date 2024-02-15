# wireapps

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class languageSelectToggle {
	System.setProperty("webdriver.chromer.driver,","C:\\Selenium webdriver\\ChromeDriver.chromerdriver.exe");
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void BeforeTest() {
		driver.get("https://translate.google.com/");
		System.out.println(driver.getTitle());
	}
	
	@Test 
	public void languageToggle() {
		WebElement checkBox1 = driver.findElement(By.className("VfPpkd-Bz112c-RLmnJb"));
		  
		//Click the language select button
		checkBox1.click();
		System.out.println("Click on the language select button");
				  
		Thread.sleep(2000);
				  
		//Click the language select button to reverse
		checkBox1.click();
		System.out.println("Click on the language select button to reverse");
		Thread.sleep(2000);
		
		WebElement checkBox2 = driver.findElement(By.className("VfPpkd-Bz112c-RLmnJb"));
		  
		//Click the language select button
		checkBox2.click();
		System.out.println("Click on the language select button");
				  
		Thread.sleep(2000);
				  
		//Click the language select button to reverse
		checkBox2.click();
		System.out.println("Click on the language select button to reverse");
	}
	
	@AfterTest 
	public void afterTest() throws InterruptedException {
		//Wait for 3 seconds till the page loads
		Thread.sleep(3000);
		//quit the browser
		driver.quit();
	}
}
