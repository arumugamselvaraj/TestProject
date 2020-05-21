import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FlightBooking extends Base{
	@Test
	public void Booking()
	{
	driver.findElement(By.name("tripType")).sendKeys("Round Trip");
	Select passcount = new Select(driver.findElement(By.name("passCount")));
	passcount.selectByVisibleText("3");
	
	Select fromPort = new Select(driver.findElement(By.name("fromPort")));
	fromPort.selectByVisibleText("London");
	
	Select fromMonth = new Select(driver.findElement(By.name("fromMonth")));
	fromMonth.selectByVisibleText("March");
	
	
	Select fromDay = new Select(driver.findElement(By.name("fromDay")));
	fromDay.selectByVisibleText("12");
	Select toPort = new Select(driver.findElement(By.name("toPort")));
	toPort.selectByVisibleText("Frankfurt");
	
	driver.findElement(By.name("servClass")).sendKeys("Business Class");
	Select airline = new Select(driver.findElement(By.name("airline")));
	airline.selectByVisibleText("Unified Airlines");
	
	driver.findElement(By.name("findFlights")).click();
	

}
}
