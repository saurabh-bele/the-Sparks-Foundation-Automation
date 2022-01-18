package TheSparksFoundation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class corporateprogramsTest {
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
   public void clickoncorporateprogram()
   {
 	driver.findElement(By.xpath("//a[contains(text(),'Corporate Programs')]")).click(); 
   }
  @Test(priority = 3)
  public void verifytitle()
  {
	  String expectedtitle="Corporate Programs";
	 String title= driver.findElement(By.xpath("//h2[contains(text(),'Corporate Programs')]")).getText();
	 Assert.assertEquals(title, expectedtitle);
  }
  @Test(priority = 4)
  public void Testcorporatevisitsandexternships()
  {
	  String expectedcorporatevisitsandexternships="We organize visits to Corporate offices for students belonging to low income group families.";
	  String actualcorporatevisitsandexternships=driver.findElement(By.xpath("//p[contains(text(),'We organize visits to Corporate offices for students belonging to low income group families')]")).getText();
	 Assert.assertEquals(actualcorporatevisitsandexternships, expectedcorporatevisitsandexternships); 
  }
  @Test(priority =5)
  public void testcharitableteambuildingprograms()
  {
	  String expectedcharitableteambuildingprograms="Doing charity work as a team can help build bonds, strengthen communication skills and boost morale while making a positive difference in the lives of people who need it most.";
	  String actualcharitableteambuildingprograms = driver.findElement(By.xpath("//p[contains(text(),'Doing charity work as a team can help build bonds, strengthen communication skills and boost morale while making a positive difference in the lives of people who need it most')]")).getText();
      Assert.assertEquals(expectedcharitableteambuildingprograms,actualcharitableteambuildingprograms);
  }
  
}
