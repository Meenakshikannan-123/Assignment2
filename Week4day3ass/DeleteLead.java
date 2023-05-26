package Week4day3ass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DeleteLead {
	public static void main(String[] args) throws InterruptedException {
		
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
		
		WebElement phone = driver.findElement(By.xpath("//span[text()='Phone']"));
		phone.click();

		WebElement phoneNumber = driver.findElement(By.name("phoneNumber"));
		phoneNumber.sendKeys("8012787044");

		WebElement findLeads = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		findLeads.click();
		
		WebElement selectFirstLeadId = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		String leadId =selectFirstLeadId.getText();
		selectFirstLeadId.click();
	
		WebElement delete =driver.findElement(By.className("subMenuButtonDangerous"));
		delete.click();

		WebElement findLead1 = driver.findElement(By.linkText("Find Leads"));
		findLead1.click();
		
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadId);
	
		driver.findElement(By.xpath("//button[text()='Find Lead']")).click();
		Thread.sleep(3000);
	
		String recordDisplay=driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		if(recordDisplay.equalsIgnoreCase("No records to display")) {
			System.out.println(leadId+ "is deleted");
		}else {
			System.out.println(leadId+ "is not deleted");
		}
		
			} 
	 
     

}
