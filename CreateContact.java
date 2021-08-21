package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Aruldoss");
		driver.findElement(By.id("lastNameField")).sendKeys("Muthuraj");
		driver.findElement(By.id("createContactForm_birthDate")).sendKeys("11/25/93");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Arul");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Doss");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Iam Testing the page");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("aruldoss15@live.com");
		WebElement sel = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select s1=new Select(sel);
		s1.selectByVisibleText("New York");
		
		WebElement Submit = driver.findElement(By.name("submitButton"));
		Submit.click();
		
		WebElement edit = driver.findElement(By.linkText("Edit"));
		edit.click();
		
		driver.findElement(By.id("updateContactForm_description")).clear();
		
		WebElement Submit2 = driver.findElement(By.name("submitButton"));
		Submit2.click();
		
	}

}
