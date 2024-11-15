package automation;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Nimap_Auto_1 {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
    }
	
	@Test
	public void test1() throws InterruptedException {
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
	    }
	@AfterMethod
	 public void tearDown() {
		 driver.quit();
	    }
	}

