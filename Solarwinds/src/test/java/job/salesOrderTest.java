package job;

import org.openqa.selenium.WebElement;
import org.testng.ITestContext;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class salesOrderTest extends BaseClass {
	
	@Parameters ({"type", "scenario"})
	@Test (priority = 1)
	
	 public void createSO( ITestContext context, @Optional ("") String type, @Optional ("") String scenario)

	{
		//System.out.println("Type: " + context.getAttribute("type").toString());
		
		
		salesOrderPage SOP = new salesOrderPage(type);
		System.out.println("sales order page");
		SOP.SOFillingForm(type);
		SOP.addItem(type);
		context.setAttribute("SO", "SN89342");
		
	}
	
	
	
	
	
}
