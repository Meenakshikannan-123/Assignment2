package Week4day3ass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class RadioButton {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//label[text()='Edge']")).click();
		
		driver.findElement(By.xpath("//label[text()='Hyderabad']")).click();
	//unselected
		String unselected =driver.findElement(By.xpath("//label[text()='Bengaluru']")).getAttribute("value");
		String unselected1=driver.findElement(By.xpath("//label[text()='Chennai']")).getAttribute("value");
		System.out.println("unselected="+unselected + " , " +unselected1);
		
		
		WebElement clicked=driver.findElement(By.xpath("//index[@class=ui-radiobutton-box ui-widget ui-corner-all ui-state-default ui-state-active]"));
		System.out.println(clicked.getText());
		
		boolean enabled=clicked.isEnabled();
		System.out.println(enabled);
		Thread.sleep(3000);
		driver.close();
	}

}
