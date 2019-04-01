package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SwitchCompanyPage extends AbstractPage {
	public SwitchCompanyPage(){
		PageFactory.initElements(getEventDriver(), this);
	}

	@FindBy(how = How.ID, using = "companyName")
	WebElement companyName;
	
	@FindBy(how = How.ID, using = "address1")
	WebElement address1;
	
	@FindBy(how = How.ID, using = "address2")
	WebElement address2;
	
	@FindBy(how = How.ID, using = "city")
	WebElement city;
	
	@FindAll(@FindBy(how = How.ID, using = "USStates-createCompany"))
	List<WebElement> stateDropdow;	
	
	@FindBy(how = How.ID, using = "USStates-createCompany")
	WebElement selectState;
	
	@FindBy(how = How.ID, using = "phoneNumber")
	WebElement phoneNumber;
	
	@FindBy(how = How.ID, using = "zip")
	WebElement zip;
	
	@FindBy(how = How.ID, using = "addCompanyBtn")
	WebElement createNewAccount;
	
	
	public SwitchCompanyPage createNewAccount(String CompanyName, String CompanyAddress, String City, String ZipCode, String State, String BuisnessPhone)  {
		click(createNewAccount);
		type(companyName, CompanyName);
		type(address1, CompanyAddress);
		type(address2, CompanyAddress);
		type(city, City);
		selectUsingText(selectState, State);
		type(zip, ZipCode);
		type(phoneNumber, BuisnessPhone);
		return new SwitchCompanyPage();
	}
}
