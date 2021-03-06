package project.pages.page;

import org.openqa.selenium.WebDriver;

import project.pages.map.LoginPageMap;

public class LoginPage extends LoginPageMap {
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void enterUsername(String uid) {
		username.sendKeys(uid);
	};
	
	public void enterPassword(String pwd) {
		username.sendKeys(pwd);
	};
	
	public void clickLoginBtn() {
		loginbtn.click();
	};	

	public void LoginMethod(String uid, String pwd) {
		enterUsername(uid);
		enterPassword(pwd);
		clickLoginBtn();
	}
}
