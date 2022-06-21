package Week5Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact extends BaseClass {
	@Test
	public  void main() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver Driver= new ChromeDriver();
		Driver.get("http://leaftaps.com/opentaps/control/main");
		Driver.manage().window().maximize();
		
		Driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		Driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		Driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		Driver.findElement(By.linkText("CRM/SFA")).click();
		//Driver.findElement(By.xpath("//text(),'CRM/SFA']"));
		//Driver.findElement(By.xpath("//div[@class='x-panel-tl']/div[class='x-panel-header']")).click();
		//Driver.findElement(By.linkText("Contacts")).click();
		Driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		Driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		Driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Trialforename");
		Driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("Trialfirstname");
		Driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("TrialSurname");
		Driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("TrialLastname");
		Driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("TrialDeptname");
		Driver.findElement(By.xpath("//textarea[@class='inputBox']")).sendKeys("Describing the text");
		//Driver.findElement(By.xpath("//input[@name='primaryEmail']")).sendKeys("test@testmail.com");
		
		WebElement drop=Driver.findElement(By.xpath("//select[@class='inputBox']"));
		Select elesource=new Select(drop);
		elesource.selectByVisibleText("New York");
		
		Driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		
	
	}
}
