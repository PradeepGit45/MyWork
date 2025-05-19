package job;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Optional;

public class InvoicePage extends BaseClass {

	//webelements 
	WebElement name;
	WebElement password;
	WebElement ID;
	WebElement AddButton;
	WebElement submit;
	WebElement licenseLink;
	
	
	
	
	void InvoiceFillingForm( String scenario, String type)
	{
		

		if ( scenario.equals("FromSO"))
		{
			
			System.out.println("Inv from SO");
			System.out.println("do not click INV Button");
			
			
			
		}
		
		else 
		{
			BaseClass.setup();
			
			if (type.equals("create"))
			{
				System.out.println("logic for create");
				
			}
			else 
				if(type.equals("renew")) {
				System.out.println("logic for renew");
			}
			
			System.out.println("Inv from Customer");
			System.out.println("Click Inv button from Customer");
			System.out.println("Fill up the details");
			Helpers.sendkeys(name, "Pradeep" , "Name");
			Helpers.sendkeys(password, "***", "Password");
			Helpers.sendkeys(ID, "SN938492", "ID " );
			addItem();
			
		}
		Helpers.click("submit");
		
		
		
	
		
		
	}
	
	void addItem()
	{
		
		Helpers.click("AddButton");
		
		
		
		
	}

	public void  checkLicenseCreation()
	{
		System.out.println("Waits for license creation");
		
		
	}
	public LicensePage clickLicenseLink() {
		
        Helpers.click("license link clicked");
        return new LicensePage(); // or initialize with PageFactory etc.
        
	}
	
	
	
	
	
	
	
}
