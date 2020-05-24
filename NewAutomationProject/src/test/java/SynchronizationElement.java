
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SynchronizationElement {
	public WebDriver driver = null;
	public String baseurl = "https://anaithugoundermatrimony.com";

	
	@BeforeTest
	public void LaunchBrowswer() {
		
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
			driver.get(baseurl);
		}
		
		
		
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	@Test
	public void ElementCheckModule()
	{
		WebElement username=driver.findElement(By.name("username"));
		WebElement password=driver.findElement(By.name("password"));
		SendKeys(driver,username,20,"Demo");
		SendKeys(driver,password,10,"Demo123");
		WebElement LoginBtn=driver.findElement(By.id("Loginbtn"));
		ClickOn(driver,LoginBtn,5);
		
	}
	public static void SendKeys(WebDriver driver,WebElement element,int timeout,String value)
	
	{
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	
	public static void ClickOn(WebDriver driver,WebElement element,int timeout)
	{
		new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	

}
