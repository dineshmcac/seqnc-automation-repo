package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends AbstractPage{
	
	public LoginPage(){
		PageFactory.initElements(getEventDriver(), this);
	}
	
	@FindBy(how = How.ID, using = "userLoginname")
	WebElement username;

	@FindBy(how = How.ID, using = "password")
	WebElement password;
	
	@FindBy(how = How.ID, using = "loginBtn")
	WebElement loginBtn;
	
	@FindBy(how = How.XPATH, using = "//div[@class='popup-inner']/h4")
	WebElement val;
	
	
	public HomePage login(String user, String pwd) {
		type(username, user);
		type(password, pwd);
		click(loginBtn);
		return new HomePage();
	}
	
	public HomePage login() {
		type(username, "sridharanbe.ece@gmail.com");
		type(password, "Test@123");
		click(loginBtn);
		return new HomePage();
	}
	
	public LoginPage emptyUserName(String user, String pwd) {
		type(username, user);
		type(password, pwd);
		click(loginBtn);
		if(getText(val).equalsIgnoreCase("Enter your password") && pwd.equalsIgnoreCase("")
			|| getText(val).equalsIgnoreCase("Enter username and password")
			|| getText(val).trim().equalsIgnoreCase("Enter your username")
			||getText(val).equalsIgnoreCase("Either the username or password you provided is incorrect. Please verify and re-enter to login."))
			Assert.assertTrue(true);
		else 
			Assert.fail();
		return new LoginPage();
	}

}