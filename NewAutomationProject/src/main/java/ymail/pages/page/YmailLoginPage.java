package ymail.pages.page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import ymail.pages.map.YmailLoginPageMap;

public class YmailLoginPage extends YmailLoginPageMap {
	public WebDriver driver=null;
	public YmailLoginPage(WebDriver driver) {
		super(driver);
	}

	public void enterUsername(String uid) {
		username.sendKeys(uid);
	};
	
	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	};
	
	public void toMail(String tomail) {
		Tomail.sendKeys(tomail);
	};
	
	public void subject(String subject) {
		toSubject.sendKeys(subject);
	};
	public void mailSend() {
		mailClick.click();
	}
	
	
	public void compose()
	{
		compose.click();
	}
	
public void enterPath1() {
		
		WebElement inboxsize=inbox1;
		String inboxtext=inbox1.getText();
		System.out.println(inboxsize);
		System.out.println(inboxtext);
		
	};
	public void subjectVerify() {
		String subjecTitle=SubjectVerify.getText();
		System.out.println(subjecTitle);
	}
	public void enterPath() {
		
		List<WebElement> emailList = inbox;
		System.out.println(emailList.size());
		
		
		String MyMailer ="test";

	
		for(int i=0;i<emailList.size();i++){
		    if(inbox.get(i).isDisplayed()==true){
		        // now verify if you have got mail form a specific mailer (Note Un-read mails)
		        // for read mails xpath loactor will change but logic will remain same
		        if(emailList.get(i).getText().equals(MyMailer)){
		            System.out.println("Yes we have got mail form " + MyMailer);
		            // also you can perform more actions here 
		            // like if you want to open email form the mailer
		            break;
		        }else{
		            System.out.println("No mail form " + MyMailer);
		        }
		    }
	}
		
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
	/*public void YmailLoginCountMethod(String uid, String pwd) {
		enterUsername(uid);
		clickLoginBtn();
		enterPassword(pwd);
		clickLoginBtn();
		//enterPath1();
		//enterPath();
		
		
		
	}*/
	
	public void SendYmail(String uid, String pwd,String tomail,String subject)
	{
		enterUsername(uid);
		clickLoginBtn();
		enterPassword(pwd);
		clickLoginBtn();
		compose();
		toMail(tomail);
		subject(subject);
		mailSend();
		subjectVerify();
		
	}
}



