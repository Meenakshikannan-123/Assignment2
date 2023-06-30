package week8day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

public class Pvrcinemas {
	public static void main(String[] args) throws InterruptedException {
		EdgeOptions option=new EdgeOptions();
		option.addArguments("--diasble-notification","Start-Maximized");

		EdgeDriver driver=new EdgeDriver(option);
		driver.get(" https://www.pvrcinemas.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	

		driver.findElement(By.xpath("//div[text()='Movie Library ']")).click();
		Thread.sleep(5000);
		WebElement city = driver.findElement(By.name("city"));
		Thread.sleep(5000);
		Select cityChennai = new Select(city);
		cityChennai.selectByVisibleText("Chennai");

		WebElement generic = driver.findElement(By.name("genre"));
		Thread.sleep(5000);
		Select animation = new Select(generic);
		animation.selectByVisibleText("ANIMATION");


		WebElement language = driver.findElement(By.name("lang"));
		Select english = new Select(language);
		english.selectByVisibleText("ENGLISH");

		driver.findElement(By.xpath("//button[text()='Apply']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='movie-wrapper ng-star-inserted'][1]")).click();

		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		WebElement cinema = driver.findElement(By.name("cinemaName"));
		Select cname=new Select(cinema);
		cname.selectByVisibleText("PVR Velachery Chennai");

		WebElement time = driver.findElement(By.name("timings"));
		Select stime=new Select(time);
		stime.selectByIndex(1);

		driver.findElement(By.name("name")).sendKeys("Meenakshi");

		driver.findElement(By.name("email")).sendKeys("meenakshikannan1999@gmail.com"); 
		driver.findElement(By.name("mobile")).sendKeys("9384653686");

		driver.findElement(By.name("noOfTickets")).sendKeys("2");
		WebElement food = driver.findElement(By.name("food"));
		Select food1 =new Select(food);
		food1.selectByIndex(1);

		driver.findElement(By.name("comment")).sendKeys("NA");

		driver.findElement(By.xpath("//label[@class='custom-control custom-radio']")).click();

		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();

		driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();

		driver.findElement(By.xpath("//button[@class='swal2-close']")).click();

		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();

	}

}
