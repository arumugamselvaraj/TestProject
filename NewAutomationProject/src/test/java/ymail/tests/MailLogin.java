package ymail.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import project.base.Base;
import project.pages.page.LoginPage;

public class MailLogin extends Base {
	
	
	@BeforeMethod
	void PageInit() {
		
	}
	
	@Test
	public void MailLoginValidation()
	{
		driver.findElement(By.id("login-username")).sendKeys("arubtech@yahoo.com");
		
		driver.findElement(By.id("login-signin")).click();
		driver.findElement(By.id("login-passwd")).sendKeys("8754604222");
		driver.findElement(By.id("login-signin")).click();
		driver.findElement(By.linkText("Compose")).click();
		driver.findElement(By.xpath("//*[@id=\"message-to-field\"]")).sendKeys("arubtech@yahoo.com");
		driver.findElement(By.xpath("//*[@id=\"mail-app-component\"]/div/div/div[1]/div[3]/div/div/input")).sendKeys("Selenium Test");
	driver.findElement(By.xpath("//*[@id=\"mail-app-component\"]/div/div/div[2]/div[2]/div/button")).click();		
	driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/div[3]/div[1]/div/div/div/a[3]/span[2]")).click();		
	
	}
		
	}

	
	
