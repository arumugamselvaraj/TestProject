package project.pages.page;

import org.openqa.selenium.WebDriver;


import project.pages.map.LoginPageMap;

public class LoginPage extends LoginPageMap {
	public LoginPage(WebDriver driver){super(driver);}
	
	public void LoginMethod(String uid, String pwd) {
		username.sendKeys(uid);
		password.sendKeys(pwd);
		loginbtn.click();
	}
}
