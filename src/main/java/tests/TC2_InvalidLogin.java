package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.PreAndPost;
import pages.LoginPage;

public class TC2_InvalidLogin extends PreAndPost {
	
	@BeforeClass
	public void setValues() {
		browserName="chrome";
		testCaseName="Seqnc Account";
		testDescription="Seqnc Account managment";
		category="smoke";
		dataSource="Excel";
		dataExcelName="TC002Login";
		dataSheetName="Invalid";
		authors="Dinesh Chengalvarayan";
	}
	
	@Test(dataProvider="fetchData")
	public void inValid(String UserName, 
			String Password) throws InterruptedException  {
		new LoginPage()
		.emptyUserName(UserName,Password);	
	}

}
