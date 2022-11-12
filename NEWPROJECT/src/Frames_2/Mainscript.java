package Frames_2;




import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class Mainscript extends Base_Class
{
	@Test(dataProvider = "cred",dataProviderClass = Dataprovider.class)
	
	public void demoqa(String un,String pw) 
	{
		
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email")))).sendKeys(un);
		Reporter.log("username entered...",true);
		
		driver.findElement(By.id("pass")).sendKeys(pw);
		Reporter.log("password entered...", true);

		driver.findElement(By.name("login")).click();
		Reporter.log("all the data is submitted", true);
	}

}
