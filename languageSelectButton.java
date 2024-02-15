package lakshitha;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebElement;

public class languageSelectButton {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chromer.driver,","C:\\Selenium webdriver\\ChromeDriver.chromerdriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://translate.google.com/");
		System.out.println(driver.getTitle());
		
		
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
		Thread.sleep(2000);


	}

}
