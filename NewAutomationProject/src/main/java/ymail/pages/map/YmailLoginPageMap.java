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
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div[2]/div/div[1]/nav/div/div[3]/div[1]/ul/li[1]/div/a/span[2]/span")
	protected List<WebElement> inbox;
	@FindBy(how = How.ID, using = "login-signin")
	protected WebElement loginbtn;
	@FindBy(how=How.XPATH,using="//*[@id=\"app\"]/div[2]/div/div[1]/nav/div/div[3]/div[1]/ul/li[1]/div/a/span[2]/span")
	protected WebElement inbox1;
	@FindBy(how=How.LINK_TEXT,using="Compose")
	protected WebElement compose;
	@FindBy(how=How.XPATH,using="//*[@id=\"message-to-field\"]")
	protected WebElement Tomail;
	@FindBy(how=How.XPATH,using="//*[@id=\"mail-app-component\"]/div/div/div[1]/div[3]/div/div/input")
	protected WebElement toSubject;
	@FindBy(how=How.XPATH,using="//*[@id=\"mail-app-component\"]/div/div/div[2]/div[2]/div/button")
	protected WebElement mailClick;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"mail-app-component\"]/div[2]/div/div[2]/div/div/div[3]/div/div[1]/ul/li[3]/a/div/div[2]/div[1]/div[1]/span[1]")
	protected WebElement SubjectVerify;
	
}
