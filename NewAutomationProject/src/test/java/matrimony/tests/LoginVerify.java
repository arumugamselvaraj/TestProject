package matrimony.tests;

import org.testng.annotations.Test;
import project.base.Base;
import project.pages.page.LoginPage;

public class LoginVerify extends Base {

	@Test
	public void LoginTests() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.LoginMethod("Demo", "Demo123");
	}
}
