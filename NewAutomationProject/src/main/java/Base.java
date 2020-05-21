import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
public WebDriver driver=null;
public String baseurl="http://demo.guru99.com/test/newtours/reservation.php";


@BeforeTest
public void LaunchBrowswer()
{
	
	WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	driver.get(baseurl);
}
	

@AfterTest
public void terminateBrowser(){
    driver.close();
}


}
