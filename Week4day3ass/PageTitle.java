 package Week4day3ass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class PageTitle {
	public static void main(String[] args) {
		
	
	EdgeDriver driver =new EdgeDriver();
    driver.get("https://acme-test.uipath.com/login");
    WebElement email = driver.findElement(By.id("email"));
    email.sendKeys("Kumar.testleaf@gmail.com");
    WebElement password=driver.findElement(By.id("password"));
    password.sendKeys("leaf@12");
    WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
    loginButton.click();
    String pageTitle=driver.getTitle();
    System.out.println("pagetitle="+pageTitle);
     WebElement logOut = driver.findElement(By.xpath("//a[text()='Log Out']"));
     logOut.click();
     driver.close();
}
	}