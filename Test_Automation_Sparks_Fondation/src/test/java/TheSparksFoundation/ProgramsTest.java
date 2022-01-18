package TheSparksFoundation;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProgramsTest {
	public WebDriver driver;
  @Test(priority = 1)
  public void clickonprograms() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
  driver = new ChromeDriver();
  driver.get("https://www.thesparksfoundationsingapore.org");
  driver.manage().window().maximize();
  driver.findElement(By.xpath("//a[text()='Programs']")).click();
  Thread.sleep(1000);
  String programsurl="https://www.thesparksfoundationsingapore.org/";
  String actualprogramsurl=driver.getCurrentUrl();
  Assert.assertEquals(programsurl,actualprogramsurl );
  }
  @Test(priority = 2)
  public void clickonstudentschorshipprogram()
  {
	driver.findElement(By.xpath("//a[contains(@href,'/pro')]")).click(); 
  }
  @Test(priority = 3)
  public void verifytitle()
  {
	  String expectedtitle="Student Scholarship Program";
	 String title= driver.findElement(By.xpath("//h2[contains(text(),'Student Scholarship Program')]")).getText();
	 Assert.assertEquals(title, expectedtitle);
  }
  @Test(priority = 4)
  public void Testobjectives()
  {
	  String expectedobjectives="Ensure money is not the showstopper";
	  String actualobjectives=driver.findElement(By.xpath("//p[contains(text(),'Ensure money is not the showstopper')]")).getText();
	 Assert.assertEquals(actualobjectives, expectedobjectives); 
  }
  @Test(priority = 5)
  public void Testsetup()
  
  {
	  String expectedsetup="Prepare attractive schemes";
	  String actualsetup=driver.findElement(By.xpath("//p[contains(text(),'Prepare attractive schemes')]")).getText();
	  Assert.assertEquals(expectedsetup, actualsetup);
  }
  @Test(priority = 6)
  public void Testtarget()
  {
	  String expectedtarget="Create achievable targets";
	  String actualtarget=driver.findElement(By.xpath("//p[contains(text(),'Create achievable targets')]")).getText();
	 Assert.assertEquals(expectedtarget,actualtarget); 
  }
  @Test(priority = 7)
  public void Testsupport()
  {
	  String expectedsupport="Support students achieve it";
	  String actualsupport=driver.findElement(By.xpath("//p[contains(text(),'Support students achieve it')]")).getText();
	  Assert.assertEquals(expectedsupport,actualsupport);
  }
  
  
  
}
