package gmail_login.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import project.base.Base;

public class MailLogin extends Base {
	@Test
	public void MailLoginValidation()
	{
		driver.findElement(By.id("login-username")).sendKeys("arubtech@yahoo.com");
		
		driver.findElement(By.id("login-signin")).click();
		driver.findElement(By.id("login-passwd")).sendKeys("8754604222");
		driver.findElement(By.id("login-signin")).click();
		driver.findElement(By.linkText("Compose")).click();
			 }
		
	}

	
	
