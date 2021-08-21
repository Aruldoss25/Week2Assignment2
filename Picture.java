package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Picture {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver picture = new ChromeDriver();
		picture.get("http://leafground.com/pages/Image.html");

		//picture.findElement(By.xpath("//label[text()='Click on this image to go home page']/following-sibling::img"))
				//.click();
		//String broken = picture.findElement(By.xpath("//label[text()=\"Am I Broken Image?\"]/following-sibling::img"))
				//.getAttribute("src");
		//System.out.println("Image Broker");
		
		
		picture.findElement(By.xpath("//label[text()=\"Click me using Keyboard or Mouse\"]/following-sibling::img")).click();

	}

}
