package Week6day2ass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class W3Frame {
	public static void main(String[] args) {
		//Launch the browser
		EdgeDriver driver=new EdgeDriver();
		//Load the URL
		driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
	
		driver.manage().window().maximize();
	    //Handle the frame	
		driver.switchTo().frame("iframeResult");
		//click the try it button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//click the ok button in alert
		Alert clickOk=driver.switchTo().alert();
		clickOk.accept();
		
		
		
		
	} 

}
