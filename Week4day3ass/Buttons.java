package Week4day3ass;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Buttons {
public static void main(String[] args) {
		
	     EdgeDriver driver=new EdgeDriver();
		
		driver.get("http://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();

		// Confirm title
		WebElement title = driver.findElement(By.id("j_idt88:j_idt90"));
		title.click();
		driver.get("http://www.leafground.com/button.xhtml");
		
		// button is disabled.
		boolean button = driver.findElement(By.id("j_idt88:j_idt92")).isEnabled();
		System.out.println(button);
		
		// Submit button
		WebElement submitButton = driver.findElement(By.id("j_idt88:j_idt94"));
		org.openqa.selenium.Point Location = submitButton.getLocation();
		System.out.println(Location);
		
		//height and width
		Dimension size = driver.findElement(By.id("j_idt88:j_idt98")).getSize();
		System.out.println(size);
		
		driver.close();

}}
