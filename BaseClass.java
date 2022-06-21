package Week5Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public ChromeDriver Chrome;

	@BeforeMethod
	public void preCondition() {
		WebDriverManager.chromedriver().setup();
		Chrome = new ChromeDriver();
		Chrome.get("http://leaftaps.com/opentaps/control/main");
		Chrome.manage().window().maximize();
		Chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement eleUserName = Chrome.findElement(By.xpath("//input[@id='username']"));
		eleUserName.sendKeys("DemoSalesManager");
		Chrome.findElement(By.id("password")).sendKeys("crmsfa");
		Chrome.findElement(By.className("decorativeSubmit")).click();
	}
	
	@AfterMethod
	public void postCondition() {
		Chrome.close();
	}
}