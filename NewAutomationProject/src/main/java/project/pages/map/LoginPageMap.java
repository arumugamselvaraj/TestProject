package project.pages.map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageMap {
	
	protected LoginPageMap(WebDriver driver){
		PageFactory.initElements(driver,this);
	}

	@FindBy(name = "username")
	protected WebElement username;
	@FindBy(how = How.NAME, using = "password")
	protected WebElement password;
	@FindBy(how = How.ID, using = "loginbtn")
	protected WebElement loginbtn;
}
