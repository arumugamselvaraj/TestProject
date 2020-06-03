package ymail.pages.page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ymail.pages.map.YmailLoginPageMap;

public class YmailLoginPage extends YmailLoginPageMap {
	public YmailLoginPage(WebDriver driver) {
		super(driver);
	}

	public void enterUsername(String uid) {
		username.sendKeys(uid);
	};
	
	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	};
	
	public void enterPath() {
		
		List<WebElement> emailList = inbox;
		System.out.println(emailList.size());
	};
	
	public void clickLoginBtn() {
		loginbtn.click();
	};	

	public void YmailLoginMethod(String uid, String pwd) {
		enterUsername(uid);
		clickLoginBtn();
		enterPassword(pwd);
		clickLoginBtn();
		
		
	}
	public void YmailLoginCountMethod(String uid, String pwd) {
		enterUsername(uid);
		clickLoginBtn();
		enterPassword(pwd);
		clickLoginBtn();
		enterPath();
		
		
		
	}
}


