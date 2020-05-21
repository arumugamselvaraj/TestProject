import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {
	
public WebDriver driver=null;
public String baseurl="https://anaithugoundermatrimony.com";
@BeforeTest
public void LaunchBrowswer()
{
	System.setProperty("webdriver.chrome.driver","D:\\\\Arumugam Sir\\\\chromedriver_win32\\\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(baseurl);
}

@AfterTest
public void terminateBrowser(){
    driver.close();
}


}
