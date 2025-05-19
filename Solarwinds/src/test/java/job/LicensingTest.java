package job;

import org.openqa.selenium.WebElement;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class LicensingTest {

	@Test
	void createLicense()
	{
		
		// first, log in into NS. 
		//navigate to customer 
		//open salesorder 
		//invoice page
		//license page 
		
		InvoicePage inv = new InvoicePage();
		
		LicensePage license=  inv.clickLicenseLink();
		license.checkLicenseDetails();
		license.licenseSyncVerification();
		license.sendData();
		license.databaseChecking();
		
		//Log in into NS. Search for CUstomer and scroll to the new sales order, fill the SO page. Add item. (TIS?) 
		//submit and submit invoice page. Wait till license creation. Check for that license creation assertion. 
//		context.setAttribute("type", "create" );
//		
//		System.out.println("Wait till license creates. Refresh the page frequently");
//		
//		System.out.println("check under invoice for license creation");
//		System.out.println("wait till desired outcome comes (SUCCESS)");
//		System.out.println("license page");
//		System.out.println("Check CREATE sign");
//		System.out.println("Wait till NO ACTION comes");
//		
		
		
		
	}
	
	
	
	
	
}
