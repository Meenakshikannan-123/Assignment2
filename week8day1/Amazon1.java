package week8day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

public class Amazon1 {
	public static void main(String[] args) {

		EdgeOptions option=new EdgeOptions();
		option.addArguments("--diasble-notification","Start-Maximized");

		EdgeDriver driver=new EdgeDriver(option);
		driver.get("https://www.amazon.in");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("bags");

		driver.findElement(By.xpath("//div[@aria-label='bags for boys']")).click();

		WebElement text = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
		System.out.println(text.getText()); 

		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();

		WebElement sort = driver.findElement(By.xpath("//select[@class='a-native-dropdown a-declarative']"));
		Select sort1=new Select(sort);
		sort1.selectByVisibleText("Newest Arrivals");

		String firstbag = driver.findElement(By.xpath("(//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2'])[1]")).getText();
		System.out.println(firstbag);

		String offer = driver.findElement(By.xpath("(//div[@class='a-row a-size-base a-color-base']/span)[2]")).getText();
		System.out.println(offer);

		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();


	}
}
