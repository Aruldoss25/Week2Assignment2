package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxes {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver check = new ChromeDriver();
		check.get("http://leafground.com/pages/checkbox.html");
		
		check.findElement(By.xpath("//div[@class=\"example\"][1]/div[1]/input")).click();
		check.findElement(By.xpath("//div[@class=\"example\"][1]/div[4]/input")).click();
		check.findElement(By.xpath("//div[@class=\"example\"][1]/div[5]/input")).click();
		
		if(check.findElement(By.xpath("//div[@class=\"example\"][2]/div/input")).isSelected()) {
			System.out.println("The check box is selected");
		}
		else {
			System.out.println("the box is not selected");
		}
		
		
		WebElement veri = check.findElement(By.xpath("//div[@class=\"example\"][3]/div[2]/input"));
		
		if(veri.isSelected()){
			
			veri.click();
			System.out.println("The box is now unselected ");
			
		}
		
		List<WebElement> Allcheck = check.findElements(By.xpath("//div[@class=\"example\"][4]"));
	int ele=Allcheck.size();
	System.out.println(ele);
	
	for(int i=0;i<ele;i++) {
		Allcheck.get(i).click();
		
	}
	check.findElement(By.xpath("//div[@class=\"example\"][4]/div[1]/input[1]")).click();
	check.findElement(By.xpath("//div[@class=\"example\"][4]/div[2]/input[1]")).click();
	check.findElement(By.xpath("//div[@class=\"example\"][4]/div[3]/input[1]")).click();
	check.findElement(By.xpath("//div[@class=\"example\"][4]/div[4]/input[1]")).click();
	

	}

}
