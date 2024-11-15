package automation;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Nimap_Auto_2 {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	}
	@Test
	public void test2() throws InterruptedException {
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
	    	Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='kt-menu__link-text ng-star-inserted'and text()='Attendance']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//BUTTON[@mattooltip='Add New claim']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//INPUT[@formcontrolname='CheckInTime']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='mat-calendar-body-cell-content mat-focus-indicator' and text()= ' 4 '  ]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//INPUT[@formcontrolname='PunchInTime']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='mat-button-wrapper' and text()='Done']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//DIV[@CLASS='form-group kt-form__group row']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname='PunchOutTime']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'])[21]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'])[26]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//DIV[@CLASS='form-group kt-form__group row']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='mat-input-10']")).sendKeys("Done PunchIn");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//DIV[@CLASS='form-group kt-form__group row']")).click();
		Thread.sleep(2000);
		WebElement rn = driver.findElement(By.xpath("(//span[@class='mat-button-wrapper' and text()='Done'])[01]"));
		rn.click();
		Thread.sleep(2000);	
	}
	@AfterMethod
	 public void tearDown() {
		 driver.quit();
	    }
	}
