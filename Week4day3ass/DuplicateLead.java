package Week4day3ass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DuplicateLead {
	public static void main(String[] args) {

		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");
	
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
	
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click(); 
		
		WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
		crmsfa.click();
	
		WebElement leads = driver.findElement(By.linkText("Leads"));
		leads.click();
		
		WebElement findLead = driver.findElement(By.xpath("//a[text()='Find Leads']"));
		findLead.click();
		
		WebElement email = driver.findElement(By.linkText("Email"));
		email.click();
		
		WebElement enterEmail = driver.findElement(By.xpath("//input[@name='emailAddress']"));
		enterEmail.sendKeys("meenakshikannan@gmail");
		
		WebElement findLeads = driver.findElement(By.xpath("//button[@type='button']"));//button[text()='Find Leads']
		findLeads.click();
		
		WebElement nameOfFirstLead =driver.findElement(By.xpath("//a[text()='meenakshi']"));
		String text=nameOfFirstLead.getText();
		System.out.println(text);
		nameOfFirstLead.click();
		
		WebElement duplicate = driver.findElement(By.linkText("Duplicate Lead"));
		duplicate.click();
		
		String title=driver.getTitle();
		System.out.println(title);
		if(title.contains("Duplicate Lead")) {
			System.out.println("title is verified");
		}
		
		WebElement submit = driver.findElement(By.name("sumbit Button"));
		submit.click();
		
		WebElement duplicateName = driver.findElement(By.id("viewLead_firstName_sp"));
		
		String text1=duplicateName.getText(); 
		if(text1.equals(text)) {
			System.out.println("both names are same");
		}
		driver.quit();

}}
