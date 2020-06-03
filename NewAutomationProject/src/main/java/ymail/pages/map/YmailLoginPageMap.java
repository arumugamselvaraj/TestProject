package ymail.pages.map;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class YmailLoginPageMap {

	protected YmailLoginPageMap(WebDriver driver){
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID,using = "login-username")
	protected WebElement username;
	@FindBy(how = How.ID, using = "login-passwd")
	protected WebElement password;
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div[2]/div/div[1]/nav/div/div[3]/div[1]/ul/li[1]/div/a")
	protected List<WebElement> inbox;
	@FindBy(how = How.ID, using = "login-signin")
	protected WebElement loginbtn;
}
