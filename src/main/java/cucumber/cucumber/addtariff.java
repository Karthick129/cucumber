package cucumber.cucumber;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class addtariff {
	
	WebDriver driver;
	@Given("The user in add tariff page")
	public void the_user_in_add_tariff_page() {
		System .setProperty("webdriver.chrome.driver","C://Users//Lenovo//Downloads//chromedriver_win32//chromedriver.exe");
	    driver =new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/index.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='addtariffplans.php'] [1]")).click();
	}

	@When("user enters the tariff details")
	public void user_enters_the_tariff_details(DataTable dataTable) {
		
		List<Map<String,String>> traiff = dataTable.asMaps(String.class,String.class);
		driver.findElement(By.id("rental1")).sendKeys(traiff.get(1).get("Mrental"));
		driver.findElement(By.id("local_minutes")).sendKeys(traiff.get(1).get("LMinute"));
		driver.findElement(By.id("inter_minutes")).sendKeys(traiff.get(2).get("Iminute"));
		driver.findElement(By.id("sms_pack")).sendKeys(traiff.get(2).get("smspack"));
		driver.findElement(By.id("minutes_charges")).sendKeys(traiff.get(1).get("Lpminutes"));
		driver.findElement(By.id("inter_charges")).sendKeys(traiff.get(0).get("IpMinute"));
		driver.findElement(By.id("sms_charges")).sendKeys(traiff.get(1).get("Smscharge"));
	    
	}

	@When("user clicks the submit button")
	public void user_clicks_the_submit_button() {
		driver.findElement(By.name("submit")).click();

		
	   
	}

	@Then("traiff added successfully")
	public void traiff_added_successfully() {
		
		String title= driver.getTitle();
		if(title.equals("Guru99 telecom"))
		{
			System.out.println("tariff added successfully");
		}
	
	
		
	}



}
