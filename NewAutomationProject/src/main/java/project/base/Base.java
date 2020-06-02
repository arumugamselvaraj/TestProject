package project.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public WebDriver driver = null;
	public String baseurl = "https://login.yahoo.com/?.src=ym&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd";

	@Parameters({ "browser" })
	@BeforeTest
	public void LaunchBrowswer(String browser) {
		
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions cOptions=new ChromeOptions();
			cOptions.addArguments("'--disable-web-security', '--user-data-dir', '--allow-running-insecure-content'");
			driver = new ChromeDriver(cOptions);			
		}
		
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		driver.get(baseurl);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}



}
