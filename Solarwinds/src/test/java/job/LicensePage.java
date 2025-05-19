package job;

import org.openqa.selenium.WebElement;

public class LicensePage {

	//webelements 
	WebElement LicenseKey;
	WebElement NoAction;
	WebElement SFsync;
	WebElement DBsync;
	
	
	void checkLicenseDetails()
	{
		Helpers.getText(LicenseKey, "License Key- 2137-4352-1532-5235");
		System.out.println("Checks other licenses details ");
		
	}

	
	public void licenseSyncVerification() {
		// TODO Auto-generated method stub
		

		System.out.println("Get and save licence keys, and other data");
		System.out.println("Check SF syncing and other sync details");
		
	}

	public void sendData() {
	  
		System.out.println("Data saved in Excel");
		
	}

	public void databaseChecking()
	{
		
		
		System.out.println("Db checking");
		
	}

	
	
	
	
	
	
	
	
}
