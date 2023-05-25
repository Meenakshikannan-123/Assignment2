package Week4day3ass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
	public static void main(String[] args) {
		EdgeDriver driver =new EdgeDriver();
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		//Locate username  and password using id locator
	    WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");
	
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		
		//click on the Login button 
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click(); 
	// click on crm/sfa link	
		WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
		crmsfa.click();
		//click on contacts button
		WebElement contacts = driver.findElement(By.linkText("Contacts"));
		contacts.click();
//click on create contact
		WebElement createContacts= driver.findElement(By.linkText("Create Contact"));
		createContacts.click();
		// fristname    
		WebElement firstName = driver.findElement(By.id("firstNameField"));
		firstName.sendKeys("meenakshi");
	//lastname	
		WebElement lastName = driver.findElement(By.id("lastNameField"));
		lastName.sendKeys("k");
		//fistname local
		WebElement firstNameLocal = driver.findElement(By.id("createContactForm_firstNameLocal"));
		firstNameLocal.sendKeys("Meena");
		//lastname local
		WebElement lastNameLocal = driver.findElement(By.id("createContactForm_lastNameLocal"));
		lastNameLocal.sendKeys("Mano");
		// department
		WebElement departmentName = driver.findElement(By.id("createContactForm_departmentName"));
		departmentName.sendKeys("software Testing");
		//description
		WebElement descriptionBox = driver.findElement(By.id("createContactForm_description"));
		descriptionBox.sendKeys("automation testing is used to write and excute the testscripts");
		//email
		WebElement emailAddress = driver.findElement(By.id("createContactForm_primaryEmail"));
		emailAddress.sendKeys("Meenakshikannan1999@gmail.com");
		
		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select state1=new Select(state);
		state1.selectByVisibleText("New York");
		// create contact
		WebElement createContact = driver.findElement(By.name("submitButton"));
		createContact.click();
		//edit button
		WebElement edit = driver.findElement(By.className("subMenuButton"));
		edit.click();

		WebElement clearDes = driver.findElement(By.id("updateContactForm_description"));
		clearDes.clear();
		
		WebElement importantNote = driver.findElement(By.id("updateContactForm_importantNote"));
		importantNote.sendKeys("Welcome");
		WebElement update=driver.findElement(By.xpath("//input[@value='Update']"));
		update.click();
		System.out.println(driver.getTitle());
		
	}

}
