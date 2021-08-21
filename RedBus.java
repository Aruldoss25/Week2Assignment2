package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver red = new ChromeDriver();
		red.get("https://www.redbus.in/");

		red.manage().window().maximize();
		red.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		red.findElement(By.id("src")).sendKeys("chennai");
		Thread.sleep(2000);
		red.findElement(By.xpath("//li[@data-no='3']")).click();

		red.findElement(By.id("dest")).sendKeys("Tirunelveli");
		Thread.sleep(2000);
		red.findElement(By.xpath("//li[@data-no='2']")).click();
		Thread.sleep(2000);

		red.findElement(By.id("onward_cal")).click();
		red.findElement(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr[7]/td[3]")).click();
		Thread.sleep(2000);

		red.findElement(By.id("search_btn")).click();

		red.findElement(By.xpath("//div[@class='close']")).click();

		String text1 = red.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("Number of Buses available " + text1);
		Thread.sleep(4000);
		red.findElement(By.xpath("//label[text()='SLEEPER']/preceding-sibling::label")).click();
		String text2 = red.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("Number of Buses available in sleeper " + text2);
		red.findElement(By.xpath("//label[text()='SLEEPER']")).click();
		Thread.sleep(2000);
		red.findElement(By.xpath("//label[text()='AC']")).click();
		String text3 = red.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("Number of Buses available in AC " + text3);
		Thread.sleep(4000);
		red.findElement(By.xpath("//label[text()='NONAC']")).click();
		String text4 = red.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("Number of Buses available in AC and nonAC " + text4);

	}

}
