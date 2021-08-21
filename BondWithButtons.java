package week2.day2;

import java.sql.Driver;

import javax.swing.text.html.parser.Element;

import org.apache.commons.codec.binary.Hex;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class BondWithButtons {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver bond=new ChromeDriver();
		bond.get("http://leafground.com/pages/Button.html");
		
		bond.findElement(By.xpath("//button[text()='Go to Home Page']")).click();
		
		Point posi = bond.findElement(By.xpath("//button[text()='Get Position']")).getLocation();
System.out.println(posi);

String color = bond.findElement(By.xpath("//button[text()='What color am I?']")).getCssValue("background-color");


System.out.println(color);
 Dimension size = bond.findElement(By.xpath("//button[text()='What is my size?']")).getSize();
 System.out.println(size);

 

	}

}
