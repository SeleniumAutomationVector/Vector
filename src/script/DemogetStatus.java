package script;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemogetStatus {

	@BeforeMethod
	public void openTest()
	{
		Reporter.log("open test",true);
	}
	
	@Test
	public void testA()
	{
		Reporter.log("Run test A",true);
	}
	
	@Test
	public void testB()
	{
		Reporter.log("Run test B",true);
		Assert.fail();
	}
	
	@AfterMethod
	public void closeApp(ITestResult res)
	{
		String name=res.getName();
		int status=res.getStatus();
		Reporter.log("close test:"+name+"status"+status,true);
	}
	
	

}
