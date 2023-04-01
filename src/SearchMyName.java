import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchMyName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Login to Google.com and search my name
		//Install the Chrome driver
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		//Using the web driver
		driver = new ChromeDriver();
		
		//Open the web site
		driver.get("https://www.google.com");
		
		//Locate the search box and insert my name
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Nour Sabbouba");
				
		//Click the search button
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		
		//Create a list for elements from the same class
		List<WebElement> listElement = driver.findElements(By.className("LC20lb"));
		
		//Create a loop to print the Elements(from the same class)
		for(int i =0;i<listElement.size();i++) {
		 String elementText = listElement.get(i).getText(); 
		 System.out.println(elementText); 
		
	}
		}

}