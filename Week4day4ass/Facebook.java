package Week4day4ass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver =new EdgeDriver();
	
		driver.get("https://www.facebook.com/");
	
		driver.manage().window().maximize();

		WebElement createNewAccount = driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration-form-button')]"));
		createNewAccount.click();

		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Meenakshi");
		
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("kannan");
		
		WebElement mobileNumber = driver.findElement(By.name("reg_email__"));
		mobileNumber.sendKeys("9940615693");
		
		WebElement password = driver.findElement(By.id("password_step_input"));
		password.sendKeys("meena123");
		
		WebElement day = driver.findElement(By.id("day"));
		Select day1=new Select(day);
		day1.selectByValue("5");
		
		WebElement month = driver.findElement(By.id("month"));
		Select month1=new Select(month);
		month1.selectByValue("10");
		
		WebElement year = driver.findElement(By.id("year"));
		Select year1=new Select(year);
		year1.selectByValue("1999");
	
		WebElement gender = driver.findElement(By.xpath("//label[text()='Female']"));
		gender.click();
		
		
	}

}
