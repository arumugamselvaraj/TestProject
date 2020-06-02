package ymail.pages.page;

import org.openqa.selenium.WebDriver;

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
	
	public void clickLoginBtn() {
		loginbtn.click();
	};	

	public void YmailLoginMethod(String uid, String pwd) {
		enterUsername(uid);
		clickLoginBtn();
		enterPassword(pwd);
		clickLoginBtn();
		
	}
}


