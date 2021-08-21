package week2.day2;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLink {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver hyper=new ChromeDriver();
		hyper.get("http://leafground.com/pages/Link.html");
		
		
		String href = hyper.findElement(By.xpath("//a[text()='Go to Home Page']")).getAttribute("href");
		System.out.println("the Home page is: " +href);

		
	WebElement button = hyper.findElement(By.xpath("//a[@href='Button.html']"));
	String a1= button.getAttribute("href");
	System.out.println(a1);
	
	hyper.findElement(By.xpath("//a[text()='Verify am I broken?']")).click();
	String link=hyper.getTitle();
	System.out.println("Broker link :" +link);
	
	List<WebElement> findElement = hyper.findElements(By.tagName("a"));
	System.out.println("The links in the pages are "+ findElement);

	}

}
