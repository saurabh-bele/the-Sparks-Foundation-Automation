package TheSparksFoundation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class studentsosprogramTest {
   public WebDriver driver;
		  @Test(priority = 1)
		  
		  public void clickOnPrograms()
		   {
		  System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://www.thesparksfoundationsingapore.org");
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//a[text()='Programs']")).click();
		  try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  String programsurl="https://www.thesparksfoundationsingapore.org/";
		  String actualprogramsurl=driver.getCurrentUrl();
		  Assert.assertEquals(programsurl,actualprogramsurl );
		  }
		   @Test(priority = 2)
		   public void clickonstudentsosprogram()
		   {
		 	driver.findElement(By.xpath("//a[contains(text(),'Student SOS Program')]")).click(); 
		   }
		  @Test(priority = 3)
		  public void verifytitle()
		  {
			  String expectedtitle="Student SOS Program";
			 String title= driver.findElement(By.xpath("//h2[contains(text(),'Student SOS Program')]")).getText();
			 Assert.assertEquals(title, expectedtitle);
		  }
		  @Test(priority = 4)
		  public void Testwhatissos()
		  {
			  String expectedwhatissos="SOS have been used as a code for emergency since 1905";
			  String actualwhatissos=driver.findElement(By.xpath("//p[contains(text(),'SOS have been used as a code for emergency since 1905')]")).getText();
			 Assert.assertEquals(actualwhatissos, expectedwhatissos); 
		  }
		  @Test(priority = 5)
		  public void Testsetup()
		  {
			  String expectedsetup="Prepare attractive schemes";
			  String actualsetup=driver.findElement(By.xpath("//p[contains(text(),'Prepare attractive schemes')]")).getText();
			 Assert.assertEquals(actualsetup, expectedsetup); 
		  }
		  @Test(priority = 6)
		  public void Testtarget()
		  {
			  String expectedtarget="Create achievable targets";
			  String actualtarget=driver.findElement(By.xpath("//p[contains(text(),'Create achievable targets')]")).getText();
			  Assert.assertEquals(expectedtarget, actualtarget);
		  }
		  @Test(priority = 7)
		  public void TestSupport()
		  {
			  String expectedsupport="Support students achieve it";
			  String actualsupport=driver.findElement(By.xpath("//p[contains(text(),'Support students achieve it')]")).getText();
		      Assert.assertEquals(expectedsupport,actualsupport);
		  
		}

  
}
