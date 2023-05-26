package Week4day3ass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {

		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		//ul Automation
		WebElement selectTool = driver.findElement(By.className("ui-selectonemenu"));
		Select select1=new Select(selectTool);
		select1.selectByVisibleText("Selenium");
		//country
		WebElement countryTextBox = driver.findElement(By.id("j_idt87:country_label"));
	    countryTextBox .click();
	  
	    WebElement preferredCountry = driver.findElement(By.id("j_idt87:country_3"));
	    preferredCountry.click();

	    //  Cities 
	    WebElement selectCities = driver.findElement(By.xpath("//label[text()='Select City']"));
	    selectCities.click();
	    
	    WebElement preferredCity = driver.findElement(By.xpath("//li[text()='Chennai']"));
	    preferredCity.click();

	    // Course 
	    WebElement course = driver.findElement(By.id("j_idt87:auto-complete_input"));
	    course.sendKeys("Selenium WebDriver");
	    
	    WebElement selectedCourse = driver.findElement(By.xpath("//li[@data-item-value='Selenium WebDriver']"));
	    selectedCourse.click();
	   

	    //randomly
	    WebElement language = driver.findElement(By.id("j_idt87:lang_label"));
	    language.click();
	    
	    WebElement randomlyLanguage = driver.findElement(By.xpath("//li[text()='English']"));
	    randomlyLanguage.click();
	  
	    // irrespective  language
	    WebElement irrespectiveLanguage = driver.findElement(By.id("j_idt87:value_label"));
	    irrespectiveLanguage.click();
	    
	    WebElement languageSelected = driver.findElement(By.xpath("//li[text()='one']"));
	    languageSelected.click();

	    
	    
	     driver.close();
	 
}
}