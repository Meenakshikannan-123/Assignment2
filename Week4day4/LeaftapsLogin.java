package Week4day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LeaftapsLogin {
	public static void main(String[] args) throws InterruptedException {
		//Launch browser
		EdgeDriver driver =new EdgeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Locate username field
	    WebElement username = driver.findElement(By.id("username"));
		//enter username 
		username.sendKeys("DemoSalesManager");
		//Locate password field
		WebElement password = driver.findElement(By.id("password"));
		//enter password
		password.sendKeys("crmsfa");
		//click on the Login button 
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click(); 
		
		String WelcomePageTitle = driver.getTitle();
		System.out.println("WelcomePageTitle : "+WelcomePageTitle);
		
		WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
		crmsfa.click();
		
		String HomePageTitle = driver.getTitle();
		System.out.println("HomePageTitle : "+HomePageTitle);
		
		WebElement leads = driver.findElement(By.linkText("Leads"));
		leads.click();

		WebElement createleads = driver.findElement(By.linkText("create lead"));
		createleads.click();
		
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("TestLeaf");
		
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Meenakshi");
		
		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("kannan");
		
		WebElement firstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstNameLocal.sendKeys("Meena");
		
		WebElement lastNameLocal = driver.findElement(By.id("createLeadForm_lastNameLocal"));
		lastNameLocal.sendKeys("Mano");
		
		WebElement salutation = driver.findElement(By.id("createLeadForm_personalTitle"));
		salutation.sendKeys("test");
		
		WebElement departmentName = driver.findElement(By.id("createLeadForm_departmentName"));
		departmentName.sendKeys("software Testing");
		
		WebElement descriptionBox = driver.findElement(By.id("createLeadForm_description"));
		descriptionBox.sendKeys("automation testing is used to write and excute the testscripts");
		
		WebElement phoneNumber = driver.findElement(By.id("createLeadForm_primaryphoneNumber"));
		phoneNumber.sendKeys("9384653686");
		
		WebElement emailAddress = driver.findElement(By.id("createLeadForm_primaryEmail"));
		emailAddress.sendKeys("Meenakshikannan1999@gmail.com");
		
		WebElement createLeadButton = driver.findElement(By.className("smallsumbit"));
		createLeadButton.click();
		
		Thread.sleep(4000);
		driver.close();
		
	}

}
