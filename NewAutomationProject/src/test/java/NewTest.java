import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest extends Base {
  @Test
  public void LoginTest()
  {	 
	 driver.findElement(By.name("username")).sendKeys("aru");
	 driver.findElement(By.name("password")).sendKeys("aru");	 
  }
  
  
}
