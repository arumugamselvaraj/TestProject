package ymail.tests;

import org.testng.annotations.Test;

import project.base.Base;
import ymail.pages.page.YmailLoginPage;

public class ymailLogin extends Base{
	@Test
	public void YmailLoginVerification() {
		
		YmailLoginPage YmailLogin=new YmailLoginPage(driver);
		YmailLogin.YmailLoginMethod("arubtech@yahoo.com","8754604222");
	}

}
