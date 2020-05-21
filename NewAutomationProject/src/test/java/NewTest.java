import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;





public class NewTest extends Base {
  

  
  @Parameters({"username","password"})
  @Test
  public void LoginTest(String username,String password)
  {
	 System.out.println("username"+username+"password"+password);
	 driver.findElement(By.name("username")).sendKeys(username);
	 driver.findElement(By.name("password")).sendKeys(password);
	 
  }
  
  
}
