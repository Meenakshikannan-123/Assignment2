package Week4day4ass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Matrimony {
	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://www.tamilmatrimony.in");
		
		WebElement select = driver.findElement(By.id("REGISTERED_BY"));
		Select select1=new Select(select);
		select1.selectByVisibleText("Relative");
		
		WebElement firstname = driver.findElement(By.id("NAME"));
		firstname.sendKeys("meena");
		
		WebElement  gender=driver.findElement(By.id("genderfemale"));
		gender.click();
		
		WebElement date=driver.findElement(By.id("DOBDAY"));
		Select date1=new Select(date);
		date1.selectByValue("5");
		
		WebElement month=driver.findElement(By.id("DOBMONTH"));
		Select month1=new Select(month);
		month1.selectByVisibleText("Oct");
		
		WebElement year=driver.findElement(By.id("DOBYEAR"));
		Select year1=new Select(year);
		year1.selectByVisibleText("1999");
		
		WebElement region=driver.findElement(By.id("RELIGION"));
		Select region1=new Select(region);
		region1.selectByVisibleText("Hindu");
		
		WebElement motherTongue=driver.findElement(By.id("MOTHERTONGUE"));
		Select motherTongue1=new Select(motherTongue);
		motherTongue1.selectByVisibleText("Malayalam");
		
		WebElement country=driver.findElement(By.id("COUNTRY"));
		Select country1=new Select(country);
		country1.selectByValue("98");
		
		driver.findElement(By.id("MOBILENO")).sendKeys("9384653686");
		
		driver.findElement(By.id("EMAIL")).sendKeys("meenakshi@gmail.com");
		
		driver.close();
		
	}

}
