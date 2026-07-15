package TestNG;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;




import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class hotelseapearl_TestNG {
	WebDriver d;
	@BeforeTest
	public void hotel() {
		d=new ChromeDriver();
	d.get("https://www.hotelseapearl.in/Seapearl/home.html");
		d.manage().window().maximize();
		
	}
	@Test
	public void Seapearl() throws InterruptedException, IOException, AWTException {
		
			System.out.println("Title = "+d.getTitle());
				System.out.println("Url = "+d.getCurrentUrl());
				//System.out.println("Page Source ="+d.getPageSource());
			
				//Element Photo
			WebElement ab = d.findElement(By.xpath("/html/body/div[2]/header/div/nav/div[1]/div/div[1]/div/a/div/img[1]"));
			File f=ab.getScreenshotAs(OutputType.FILE);
				FileHandler.copy(f, new File("C:\\Users\\GOKUL\\eclipse-workspace\\Selenium\\SCREENSHOT\\seapeal.png"));
				
			//Full Photo	
				File aa=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
				FileHandler.copy(aa, new File("C:\\Users\\GOKUL\\eclipse-workspace\\Selenium\\SCREENSHOT\\HotelSEApearl.png"));
			

			//ALERT POPUP
	d.findElement(By.xpath("/html/body/div[2]/header/div/nav/div[1]/div/div[2]/div[2]/div/ul/li[1]/div/div[2]/dl/dd/a")).click();
	Robot rr = new Robot();
		rr.keyPress(KeyEvent.VK_TAB);
		rr.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rr.keyPress(KeyEvent.VK_TAB);
		rr.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rr.keyPress(KeyEvent.VK_TAB);
		rr.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		rr.keyPress(KeyEvent.VK_ENTER);
		rr.keyRelease(KeyEvent.VK_ENTER);
		
		
		//new tab opening switch to parent tab (Our Social links)
		String parent = d.getWindowHandle();
		
		//Facebook
		d.findElement(By.xpath("/html/body/div[2]/header/div/nav/div[1]/div/div[2]/div[2]/div/ul/li[3]/div/div[2]/dl/dd/ul/li[1]/a")).click();
		Thread.sleep(2000);
		d.switchTo().window(parent);
		Thread.sleep(1000);
		
		//Twitter
		d.findElement(By.xpath("/html/body/div[2]/header/div/nav/div[1]/div/div[2]/div[2]/div/ul/li[3]/div/div[2]/dl/dd/ul/li[2]/a")).click();
		Thread.sleep(2000);
		d.switchTo().window(parent);
		Thread.sleep(1000);
		
		//Instagram
		d.findElement(By.xpath("/html/body/div[2]/header/div/nav/div[1]/div/div[2]/div[2]/div/ul/li[3]/div/div[2]/dl/dd/ul/li[3]/a")).click();
		Thread.sleep(2000);
		d.switchTo().window(parent);
		Thread.sleep(1000);
		
		//LinkedIn
		d.findElement(By.xpath("/html/body/div[2]/header/div/nav/div[1]/div/div[2]/div[2]/div/ul/li[3]/div/div[2]/dl/dd/ul/li[4]/a")).click();
		Thread.sleep(2000);
		d.switchTo().window(parent);
		Thread.sleep(1000);
		
		//Pinterst
		d.findElement(By.xpath("/html/body/div[2]/header/div/nav/div[1]/div/div[2]/div[2]/div/ul/li[3]/div/div[2]/dl/dd/ul/li[5]/a")).click();
		Thread.sleep(2000);
		d.switchTo().window(parent);
		Thread.sleep(1000);
		
		//	
		//image sliding right
		d.findElement(By.xpath("/html/body/div[2]/section[1]/div[4]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/div[2]/section[1]/div[4]")).click();
		Thread.sleep(2000);
		//image sliding left
		d.findElement(By.xpath("/html/body/div[2]/section[1]/div[3]")).click();
		Thread.sleep(2000);
		
		
		
	d.findElement(By.xpath("/html/body/div[2]/header/div/nav/div[2]/div/div/ul/li[2]/a")).click();
	Thread.sleep(2000);
	d.findElement(By.xpath("/html/body/div[2]/header/div/nav/div[2]/div/div/ul/li[5]/a")).click();
	Thread.sleep(2000);
	d.findElement(By.xpath("/html/body/div[2]/header/div/nav/div[2]/div/div/ul/li[6]/a")).click();
	Thread.sleep(2000);
	d.findElement(By.xpath("/html/body/div[2]/header/div/nav/div[2]/div/div/ul/li[7]/a")).click();
	Thread.sleep(2000);
	d.navigate().back();
	d.findElement(By.xpath("/html/body/div[2]/header/div/nav/div[2]/div/div/ul/li[8]/a")).click();
	Thread.sleep(2000);
	d.findElement(By.xpath("/html/body/div[2]/header/div/nav/div[2]/div/div/ul/li[9]/a")).click();
	Thread.sleep(2000);
	d.findElement(By.xpath("/html/body/div[2]/header/div/nav/div[2]/div/div/ul/li[1]/a")).click();
	Thread.sleep(2000);
	d.findElement(By.xpath("/html/body/div[2]/section[2]/div/div/div[1]/article/div/a")).click();
	Thread.sleep(2000);
	d.navigate().back();
	d.findElement(By.xpath("/html/body/div[2]/section[2]/div/div/div[2]/article/div/a")).click();
	Thread.sleep(2000);
	d.navigate().back();
	d.findElement(By.xpath("/html/body/div[2]/section[2]/div/div/div[3]/article/div/a")).click();
	Thread.sleep(2000);
	d.navigate().back();
	d.findElement(By.xpath("/html/body/div[2]/section[4]/div/div[2]/div[2]/a")).click();
	Thread.sleep(2000);
	d.navigate().back();
	d.findElement(By.xpath("/html/body/div[2]/section[7]/div/div[4]/a/div")).click();
	Thread.sleep(2000);
	d.findElement(By.xpath("/html/body/div[5]/div/div[3]/button[2]")).click();
	Thread.sleep(2000);
	d.findElement(By.xpath("/html/body/div[5]/div/div[3]/button[2]")).click();
	Thread.sleep(2000);
	d.findElement(By.xpath("/html/body/div[5]/div/div[2]/span[1]")).click();
	Thread.sleep(2000);
	d.findElement(By.xpath("/html/body/div[2]/footer/div[1]/div/div[1]/div[1]/div/div/div[2]/a")).click();

	//ALERT POPUP
	Robot r = new Robot();

	//r.keyPress(KeyEvent.VK_ESCAPE);
	//r.keyRelease(KeyEvent.x);

	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);

	Thread.sleep(1000);
	d.findElement(By.xpath("//*[@id=\"subscribe-form-footer-form-email\"]")).sendKeys("gokul",Keys.ENTER);
	//d.findElement(By.xpath("//*[@id=\"subscribe-form-footer-form-email\"]")).sendKeys("gokul@gmail.com",Keys.ENTER);
	Thread.sleep(2000);
	d.findElement(By.xpath("/html/body/div[2]/footer/div[1]/div/div[2]/div[1]/a")).click();
	Thread.sleep(3000);
	d.navigate().back();
	Thread.sleep(1000);

	d.findElement(By.xpath("/html/body/div[2]/footer/div[1]/div/div[2]/div[2]/dl[1]/dd/a[1]")).click();
	Robot r1 = new Robot();

	r1.keyPress(KeyEvent.VK_ESCAPE);
	r1.keyRelease(KeyEvent.VK_ESCAPE);
	Thread.sleep(2000);
	d.findElement(By.xpath("/html/body/div[2]/footer/div[1]/div/div[2]/div[2]/dl[1]/dd/a[2]")).click();
	Robot r11 = new Robot();

	r11.keyPress(KeyEvent.VK_ESCAPE);
	r11.keyRelease(KeyEvent.VK_ESCAPE);

	Thread.sleep(2000);
		
		


	Thread.sleep(2000);

	d.findElement(By.xpath("/html/body/div[2]/footer/div[1]/div/div[2]/div[3]/div[2]/div[1]/ul/li[2]/a")).click();
	Thread.sleep(4000);

	d.findElement(By.xpath("/html/body/div[2]/footer/div[1]/div/div[2]/div[3]/div[2]/div[1]/ul/li[3]/a")).click();
	Thread.sleep(4000);

	d.findElement(By.xpath("/html/body/div[2]/footer/div[1]/div/div[2]/div[3]/div[2]/div[1]/ul/li[3]/a")).click();
	Thread.sleep(4000);

	d.findElement(By.xpath("/html/body/div[2]/footer/div[1]/div/div[2]/div[3]/div[2]/div[2]/ul/li[1]/a")).click();
	Thread.sleep(4000);

	d.findElement(By.xpath("/html/body/div[2]/footer/div[1]/div/div[2]/div[3]/div[2]/div[2]/ul/li[2]/a")).click();
	Thread.sleep(4000);

	d.findElement(By.xpath("/html/body/div[2]/footer/div[1]/div/div[2]/div[3]/div[2]/div[2]/ul/li[3]/a")).click();
	Thread.sleep(4000);

	d.findElement(By.xpath("/html/body/div[2]/footer/div[1]/div/div[2]/div[3]/div[2]/div[2]/ul/li[4]/a")).click();
	Thread.sleep(4000);

	d.findElement(By.xpath("/html/body/div[2]/footer/div[1]/div/div[2]/div[3]/div[2]/div[1]/ul/li[1]/a")).click();
	Thread.sleep(6000);

	}

	//@Test
	//public void hai3() {
	//	
	//}
	
	@AfterTest

	public void stop() {
		
	d.quit();
	}
	}


