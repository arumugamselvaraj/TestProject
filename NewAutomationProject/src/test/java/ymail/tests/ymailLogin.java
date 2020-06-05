package ymail.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import project.base.Base;
import ymail.pages.page.YmailLoginPage;

public class ymailLogin extends Base {
	@Test
	public void YmailLoginVerification() {

		YmailLoginPage YmailLogin = new YmailLoginPage(driver);
		YmailLogin.YmailLoginMethod("arubtech@yahoo.com", "8754604222");

	}

	/*
	 * @Test public void YmailCountVerification() {
	 * 
	 * YmailLoginPage YmailLogin1=new YmailLoginPage(driver);
	 * YmailLogin1.YmailLoginCountMethod("arubtech@yahoo.com","8754604222"); }
	 */
	@Test
	public void SendYmail() {

		YmailLoginPage YmailLogin2 = new YmailLoginPage(driver);
		YmailLogin2.SendYmail("arubtech@yahoo.com", "8754604222", "arubtech@yahoo.com", "Selenium Test");

	}
}
