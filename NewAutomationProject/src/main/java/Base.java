import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

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
