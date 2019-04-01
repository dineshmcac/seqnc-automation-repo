package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.PreAndPost;
import pages.LoginPage;

public class TC001_SwitchAccount extends PreAndPost{
	
	@BeforeClass
	public void setValues() {
		browserName="chrome";
		testCaseName="Seqnc Account";
		testDescription="Seqnc Account managment";
		category="smoke";
		dataSource="Excel";
		dataExcelName="TC001";
		dataSheetName="Sheet1";
		authors="Dinesh";
	}
	
	@Test(dataProvider="fetchData")
	public void loginAsAdmin(String UserName, 
			String Password,
			String CompanyName,
			String CompanyAddress,
			String City,
			String ZipCode, 
			String State, 
			String BuisnessPhone) throws InterruptedException  {
		
		new LoginPage()
		.login(UserName,Password)
		.MoveToSetting()
		.switchAccount()
		.createNewAccount(CompanyName, CompanyAddress, City, ZipCode, State, BuisnessPhone);		
	}
}
