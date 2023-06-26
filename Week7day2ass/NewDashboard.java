package Week7day2ass;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class NewDashboard {
	public static void main(String[] args) throws InterruptedException {

		EdgeOptions option=new EdgeOptions();
		option.addArguments("--diasble-notification","Start-Maximized");

		EdgeDriver driver=new EdgeDriver(option);
		driver.get("https://login.salesforce.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		driver.findElement(By.id("Login")).click();

		//click on toggle menu button from the left corner
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();

		//click view all 
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();

		//click dashboards from app launcher
		WebElement search = driver.findElement(By.xpath("//input[@class='slds-input']"));
		search.sendKeys("Dashboards");
		driver.findElement(By.xpath("//mark[text()='Dashboards']")).click();

		// click new dashboard option
		driver.findElement(By.xpath("//div[text()='New Dashboard']")).click();

		 Thread.sleep(2000);
		//enter the name
	     
		driver.findElement(By.xpath("//input[@id='dashboardNameInput']")).sendKeys("Salesforce automation by Meenakshi");
	}

}
