import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListRadioButtons {
	public WebDriver driver = null;
	public String baseurl = "https://anaithugoundermatrimony.com/ActiverUserReg.jsp";

	
	@BeforeTest
	public void LaunchBrowswer() {
		
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
			driver.get(baseurl);
		}
		
		
	
@Test

public void ListButtons() throws Exception
{
	boolean checked=false;
List<WebElement> RadioButtons=driver.findElements(By.name("marital"));	

for(int i=0;i<RadioButtons.size();i++)
{
checked=RadioButtons.get(i).isSelected();
if(!checked)
{
RadioButtons.get(i).click();
Thread.sleep(2000);
}

}

}
}
