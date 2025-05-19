package job;

import org.openqa.selenium.WebElement;
import org.testng.ITestContext;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class InvoiceTest extends BaseClass {

	@Parameters({"scenario", "type"})
	@Test(priority = 1)
	
	

	
	
	void createInvoice( @Optional ("") String scenario, ITestContext SO, String type) 

{
			
				InvoicePage inv = new InvoicePage();
				inv.InvoiceFillingForm(scenario, type);
				inv.checkLicenseCreation();
			
//			System.out.println("Scenario" + scenario);
	
		
		

	
	
		
		
	
	
}
	
	
	
	
	
}
