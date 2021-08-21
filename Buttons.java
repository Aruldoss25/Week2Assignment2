package week2.day2;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttons {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver button=new ChromeDriver();
		button.get("http://leafground.com/pages/Dropdown.html");
		
		WebElement drp1 = button.findElement(By.id("dropdown1"));
		Select drp2=new Select(drp1);
		drp2.selectByIndex(2);
		
		WebElement drop1 = button.findElement(By.name("dropdown2"));
		Select drop2=new Select(drop1);
		drop2.selectByValue("2");
		
		WebElement drop3 = button.findElement(By.id("dropdown3"));
		Select drop4=new Select(drop3);
		drop4.selectByVisibleText("UFT/QTP");
		
	String value = button.findElement(By.className("dropdown")).getText();
	

	System.out.println("the option are :"+ value);
	
 button.findElement(By.xpath("//div[@class=\"example\"][5]/select")).sendKeys("Loadrunner");
 WebElement drop6 = button.findElement(By.xpath("//div[@class=\"example\"][5]/select"));
 Select drop5=new Select(drop6);
 drop5.selectByValue("3");




	
	
		
		
		
		
	
		

	}

}
