import org.openqa.selenium.By;
import org.testng.annotations.Test;



public class NewTest extends Base {
  @Test
  public void VerifyLogin() {
	  driver.findElement(By.name("username")).sendKeys("Demo");
	  driver.findElement(By.name("password")).sendKeys("Demo123");
	  driver.findElement(By.id("Loginbtn")).click();
	  
  }
}
