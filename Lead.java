package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		String page = "My Leads | opentaps CRM";
		String title = driver.getTitle();
		if (page.equals(title)) {
			System.out.println("The page is correct");
		} else
			System.out.println("This is not a correct page");

		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aruldoss");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Muthuraj");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("10/1/20");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Arul");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Doss");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Entering details");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Creating Lead");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("25000");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("65");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("BIJPA");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("$");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This is to create the Lead");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("In here the testing is done");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9524820844");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Arul");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("aruldoss15@live.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Aruldoss");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("57 Sivaganapuram");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Nort Street Dana");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Tirunelveli");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("627425");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("061");

		WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countryCode.clear();
		countryCode.sendKeys("5");

		WebElement drop1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropDown = new Select(drop1);
		dropDown.selectByValue("LEAD_COLDCALL");

		WebElement drop2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dropDown3 = new Select(drop2);
		dropDown3.selectByIndex(2);

		WebElement drop3 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropDown2 = new Select(drop3);
		dropDown2.selectByVisibleText("Finance");

		WebElement drop4 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropDown4 = new Select(drop4);
		dropDown4.selectByVisibleText("LLC/LLP");

		WebElement drop5 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select dropDown5 = new Select(drop5);
		dropDown5.selectByVisibleText("INR - Indian Rupee");

		WebElement drop6 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropDown6 = new Select(drop6);
		dropDown6.selectByVisibleText("Armed Forces Europe");

	


		WebElement Submit = driver.findElement(By.name("submitButton"));
		Submit.click();

		WebElement edit = driver.findElement(By.linkText("Edit"));
		edit.click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf changed");
		
		WebElement Submit2 = driver.findElement(By.name("submitButton"));
		Submit2.click();
	}

}
