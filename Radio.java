package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radio {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver rad = new ChromeDriver();
		rad.get("http://leafground.com/pages/radio.html");

		
		rad.findElement(By.id("yes")).click();
		if(rad.findElement(By.xpath("//input[@name=\"news\"]")).isSelected())
		{
			System.out.println("The default value is unchecked");
		}
		else {
	
			System.out.println("The default value is checked");
		}
		if(rad.findElement(By.xpath("//input[@name=\"age\"][2]")).isSelected())
		{
		System.out.println("The option is already selected ");
	}
		else {
			rad.findElement(By.xpath("//input[@name=\"age\"][2]")).click();
		}

}
}
