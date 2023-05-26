package Week4day3ass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EditLead {
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
		
	    	WebElement firstNameBox = driver.findElement(By.xpath("(//input[@name='firstName'])[3]"));
		    firstNameBox.sendKeys("meenakshi");
		
	    	WebElement findLeadsButton = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		    findLeadsButton.click();
		    
		    WebElement firstResultingLead = driver.findElement(By.xpath("//a[text()='15143']"));
	        firstResultingLead.click();
	      
	        
	        String title = driver.getTitle();
	        System.out.println("Page Title = " +title);
	      
	        WebElement editButton = driver.findElement(By.linkText("Edit"));
	        editButton.click();
	       
	        WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
	        companyName.sendKeys("testleaf");
	       
	        WebElement update = driver.findElement(By.name("submitButton"));
	        update.click();
	       
	        WebElement companyNameWithId = driver.findElement(By.id("viewLead_companyName_sp"));
		    String leadId = companyNameWithId.getText();
		    System.out.println("Lead Id =" +leadId);
		    
		    
		    if(leadId.contains("testleaf")) {
		    	System.out.println("The company name is verified");
		    }else {
		    	System.out.println("The company name is not verified");
		    }
		      
		  
		    driver.close();
	        

		
		
		
	}

}
