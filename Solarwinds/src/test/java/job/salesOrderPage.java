package job;

import org.openqa.selenium.WebElement;

public class salesOrderPage {

	//webelements 
	WebElement name;
	WebElement password;
	WebElement ID;
	WebElement AddButton;
	WebElement submit;
	WebElement typee;
	
	
	
	public salesOrderPage(String type)
	{
		
			BaseClass.setup();
		
		
		
	}
	void SOFillingForm(String type)
	{
	  
		Helpers.sendkeys(name, "Pradeep" , "Name");
		Helpers.sendkeys(password, "***", "Password");
		Helpers.sendkeys(ID, "SN938492", "ID " );
		Helpers.sendkeys(typee, "type", type);
		
		if (type.equals("create"))
		{
			System.out.println("logic for create");
			
		}
		else 
			if(type.equals("renew")) {
			System.out.println("logic for renew");
		}
		
		
		
		
	}
	
	void addItem(String type)
	{
		if (type.equals("create"))
		{
			System.out.println("Create Item");
			
		}
		else 
			if(type.equals("renew")) {
			System.out.println("Renew item");
		}
			else 
				if(type.equals("upgrade"))
				{
					System.out.println("Upgrade item");
				}
		Helpers.click("AddButton");
		Helpers.click("submit");
		
		
		
	}

	
	
	
	
	
}
