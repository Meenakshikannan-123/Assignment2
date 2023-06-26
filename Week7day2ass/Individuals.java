package Week7day2ass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Individuals {
	public static void main(String[] args) {
		EdgeOptions option=new EdgeOptions();
		option.addArguments("--disable-notification","Start-Maximized");


		EdgeDriver driver=new EdgeDriver(option);
		driver.get("https://login.salesforce.com/");
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		driver.findElement(By.id("Login")).click();

		//click on toggle menu button from the left corner
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();

		//click view all and click sales from App launcher
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();

		//click individual from app launcher
		WebElement search = driver.findElement(By.xpath("//input[@class='slds-input']"));
		search.sendKeys("Individuals");
		driver.findElement(By.xpath("//mark[text()='Individuals']")).click();

		//click on New button
		driver.findElement(By.xpath("//div[text()='New']")).click();
		
		//enter the last name
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Kumar");
		
		// click save 
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		//verify individuals name
		
		if(search.equals(title)) {
			System.out.println("both are same");
		}else{
			System.out.println("both are not same");
		}
	}
	
}
