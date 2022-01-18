package TheSparksFoundation;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StudentmentorshipprogramTest {
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
   public void clickonstudentmentorshipprogram()
   {
 	driver.findElement(By.xpath("//a[contains(text(),'Student Mentorship Program')]")).click(); 
   }
  @Test(priority = 3)
  public void verifytitle()
  {
	  String expectedtitle="Student Mentorship Program";
	 String title= driver.findElement(By.xpath("//h2[contains(text(),'Student Mentorship Program')]")).getText();
	 Assert.assertEquals(title, expectedtitle);
  }
  @Test(priority = 4)
  public void Testobjectives()
  {
	  String expectedobjectives="Make resources available to students to further their dreams";
	  String actualobjectives=driver.findElement(By.xpath("//p[contains(text(),'Make resources available to students to further their dreams')]")).getText();
	 Assert.assertEquals(actualobjectives, expectedobjectives); 
  }
  @Test(priority = 5)
  public void Testworkshops()
  {
	  String expectedworkshops="Industry Inspired Workshops";
	  String actualworkshops=driver.findElement(By.xpath("//p[contains(text(),'Industry Inspired Workshops')]")).getText();
	 Assert.assertEquals(actualworkshops, expectedworkshops); 
  }
  @Test(priority = 6)
  public void Testtalks()
  {
	  String expectedtalks="Special Screenings of Videos";
	  String actualtalks=driver.findElement(By.xpath("//p[contains(text(),'Special Screenings of Videos')]")).getText();
	  Assert.assertEquals(expectedtalks, actualtalks);
  }
  @Test(priority = 7)
  public void Testindiviualsessions()
  {
	  String expectedindividualsessions="Live Sessions";
	  String actualindividualsessions=driver.findElement(By.xpath("//p[contains(text(),'Live Sessions')]")).getText();
      Assert.assertEquals(expectedindividualsessions,actualindividualsessions);
  }
  @Test(priority = 8)
  public void TestProgressCheck()
  {
	  String expectedprogresscheck="Scheduled Routine Progress Monitoring";
	  String actualprogresscheck=driver.findElement(By.xpath("//p[contains(text(),'Scheduled Routine Progress Monitoring')]")).getText();
	  Assert.assertEquals(expectedprogresscheck,actualprogresscheck);
  }
  
}
