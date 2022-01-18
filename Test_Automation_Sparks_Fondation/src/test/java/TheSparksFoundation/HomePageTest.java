package TheSparksFoundation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class HomePageTest {
	public WebDriver driver;
	
  @Test(priority = 2)
  public void LogoTest() {
	  Assert.assertTrue(driver.findElement(By.xpath("//img[@src='/images/logo_small.png']")).isDisplayed());	  
  }
  @Test(priority = 3)
  public void EventTest() throws InterruptedException {
	  driver.findElement(By.xpath("//a[text()=1]")).click();
	  Thread.sleep(1000);
	  WebElement Events =  driver.findElement(By.xpath("//li[2]//div//h3[text()='Events']"));
	  Assert.assertEquals(Events.getText(), "Events");
	  WebElement EventText = driver.findElement(By.xpath("//li[2]//div//h3//following-sibling::p[contains(text(),'We organize events')]"));
	  System.out.println(EventText.getText());
  }
  @Test(priority = 4)
  public void IntershipTest() throws InterruptedException {
	  driver.findElement(By.xpath("//a[text()=2]")).click();
	  Thread.sleep(1000);
	  WebElement Interships =  driver.findElement(By.xpath("//li[3]//div//h3[text()='Internships']"));
	  Assert.assertEquals(Interships.getText(), "Internships");
	  WebElement internshipText = driver.findElement(By.xpath("//li[3]//div//h3//following-sibling::p[contains(text(),'We conduct internship')]"));
	  System.out.println(internshipText.getText());
  }
  @Test(priority = 5)
   public void MentorshipTest() throws InterruptedException {
	  driver.findElement(By.xpath("//a[text()=3]")).click();
	  Thread.sleep(1000);
	  WebElement mentorship =  driver.findElement(By.xpath("//li[4]//div//h3[text()='Mentorship']"));
	  Assert.assertEquals(mentorship.getText(), "Mentorship");
	  WebElement mentorshipText = driver.findElement(By.xpath("//li[4]//div//h3//following-sibling::p[contains(text(),'We help students')]"));
	  System.out.println(mentorshipText.getText());
 }
  @Test(priority = 6)
   public void SupportTest() throws InterruptedException {
 	  driver.findElement(By.xpath("//a[text()=4]")).click();
 	 Thread.sleep(1000);
 	  WebElement Support =  driver.findElement(By.xpath("//li[5]//div//h3[text()='Support']"));
 	  Assert.assertEquals(Support.getText(), "Support");
 	  WebElement SupportText = driver.findElement(By.xpath("//li[5]//div//h3//following-sibling::p[contains(text(),'We connect them')]"));
 	  System.out.println(SupportText.getText());
 }
  @Test(priority = 7)
   public void ScholarshipTest() throws InterruptedException {
		  driver.findElement(By.xpath("//a[text()=5]")).click();
		  Thread.sleep(1000);
		  WebElement Scholarship =  driver.findElement(By.xpath("//li[6]//div//h3[text()='Scholarship']"));
		  Assert.assertEquals(Scholarship.getText(), "Scholarship");
		  WebElement ScholarshipText = driver.findElement(By.xpath("//li[6]//div//h3//following-sibling::p[contains(text(),'We provide financial')]"));
		  System.out.println(ScholarshipText.getText());
 }
  @Test(priority = 8)
   public void CommunityTest() throws InterruptedException {
		  driver.findElement(By.xpath("//a[text()=6]")).click();
		  Thread.sleep(1000);
		  WebElement Community =  driver.findElement(By.xpath("//li[7]//div//h3[text()='Community']"));
		  Assert.assertEquals(Community.getText(), "Community");
		  WebElement CommunityText = driver.findElement(By.xpath("//li[7]//div//h3//following-sibling::p[contains(text(),'We have built')]"));
		  System.out.println(CommunityText.getText());
 }
   

   

  @Test(priority = 1)
  public void LaunchBrowser() {
	  System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.thesparksfoundationsingapore.org");
	  driver.manage().window().maximize();
	 
  }

  @Test(priority = 9)
  public void quitBrowser() {
	  driver.close();
  }

}
