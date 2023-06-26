package Week7day2ass;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

public class Opportunities {

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

		//click view all and click sales from the app launcher
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();

		//click on opportunity tab
		WebElement ele = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",ele);

		//click on New button
		driver.findElement(By.xpath("//div[text()='New']")).click();

		//enter the opportunity name as 
		Thread.sleep(3000);
		WebElement name = driver.findElement(By.xpath("(//input[@part='input'])[3]"));
		name.sendKeys("Salesforce Automation by Meenakshi");
		String text = name.getText();
		System.out.println(text);

		//choose close date as today
		driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("6/25/2023");
		
		// select stage as need analysis
		WebElement select = driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[1]"));
        select.click();
        
        Select analysis=new Select(select);
        analysis.selectByVisibleText("Needs Analysis");
        
        //click save
        driver.findElement(By.xpath("//button[text()='Save']")).click();
        String title = driver.getTitle();
		System.out.println(title);
	}
}
