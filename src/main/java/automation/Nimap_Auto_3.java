package automation;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Nimap_Auto_3 {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	}
	@Test
	public void test3() throws InterruptedException {
	driver.get("https://testffc.nimapinfotech.com/auth/login");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mynameisccoccoc@gmail.com");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456789");
	   Thread.sleep(2000);
	   String str = JOptionPane.showInputDialog("Enter your captch");
	   WebElement element = driver.findElement(By.xpath("//input[@formcontrolname='captchaValue']"));
	   element.sendKeys(str);
	   Thread.sleep(2000);
	   driver.findElement(By.id("kt_login_signin_submit")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//a[@href='/customers']")).click();
	   Thread.sleep(3000);
	   WebElement element1 = driver.findElement(By.xpath("//span[@class='mat-button-wrapper' and normalize-space(text())='New Customer']"));
	   element1.click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//INPUT[@formcontrolname='LeadName']")).sendKeys("Abz Mobz");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//INPUT[@formcontrolname='RefNo']")).sendKeys("FMUPA8705C");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//INPUT[@formcontrolname='PersonName']")).sendKeys("Abz Mobz");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//INPUT[@formcontrolname='MobileNo']")).sendKeys("1234987647");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//INPUT[@formcontrolname='Email']")).sendKeys("Abz@gmail.com");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//INPUT[@formcontrolname='Address']")).sendKeys("Block D, 16B, Satsang Colony, Seminary Hills, Nagpur, Maharashtra 440007, India");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//BUTTON[@class='mat-focus-indicator float-right mat-raised-button mat-button-base mat-primary' ]")).click();
	   Thread.sleep(2000);
	   WebElement el = driver.findElement(By.xpath("//DIV[@CLASS='mat-select-arrow-wrapper ng-tns-c80-90']"));
	   el.click();
	   driver.findElement(By.xpath("//span[@class='mat-option-text' and text()= ' India ']")).click();
	   Thread.sleep(2000);
	   WebElement hj = driver.findElement(By.xpath("//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c80-93 ng-star-inserted' and text()= 'State']"));
	   hj.click();
	   driver.findElement(By.xpath("//span[@class='mat-option-text' and text()= ' Maharashtra ' ]")).click();
	   Thread.sleep(2000);
	   WebElement kl = driver.findElement(By.xpath("//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c80-96 ng-star-inserted' and text()= 'City']"));
	   kl.click();
	   driver.findElement(By.xpath("//span[@class='mat-option-text' and text()= ' Nagpur ' ]")).click();
	   Thread.sleep(2000);
	   WebElement bn = driver.findElement(By.xpath("//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c80-99 ng-star-inserted' and text()= 'Locality']"));
	   bn.click();
	   driver.findElement(By.xpath("//span[@class='mat-option-text' and text()= ' Nagpur ']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@data-placeholder='Pincode']")).sendKeys("413003");
	   Thread.sleep(2000);
	   WebElement hi = driver.findElement(By.id("mat-select-value-39"));
	   hi.click();
	   driver.findElement(By.xpath("//span[@class='mat-option-text' and text()='Facebook ' ]")).click();
	   Thread.sleep(2000);
	   WebElement sw = driver.findElement(By.id("mat-select-value-41"));
	   sw.click();
	   driver.findElement(By.xpath("//span[@class='mat-option-text' and text()='Opportunity ' ]")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.id("mat-input-27")).sendKeys("#UrbanExploration");
	   Thread.sleep(2000); 
	}
	@AfterMethod
	public void tearDown() {
	driver.quit();
	}
}
