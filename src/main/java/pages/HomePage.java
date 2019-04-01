package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AbstractPage{

	public HomePage(){
		PageFactory.initElements(getEventDriver(), this);
	}

	@FindBy(how = How.LINK_TEXT, using = "CRM/SFA")
	WebElement crmsfa;
	
	@FindBy(how = How.XPATH, using = "//li[@class='settings-img-li']")
	WebElement setting;
	
	@FindBy(how = How.ID, using = "switch-company")
	WebElement switchcompany;
	
	
	public HomePage MoveToSetting()  {
		mouseOverOnElement(setting);
		return new HomePage();
	}
	
	public SwitchCompanyPage switchAccount() throws InterruptedException {
		click(switchcompany);
		Thread.sleep(3000);
		return new SwitchCompanyPage();
	}


}