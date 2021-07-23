package project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

    public class Final_Project
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		//1. Launch the browser
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Desktop\\Selenium jar\\chromedriver.exe");
		 WebDriver w=new ChromeDriver();
		 Thread.sleep(2000);
		
		//2. Open URL
		w.get("http://demo.guru99.com/test/newtours/index.php");
		//3.Enter UserName data is test
		w.findElement(By.name("userName")).sendKeys("test");
		//4.Enter Password data is test
		w.findElement(By.name("password")).sendKeys("test");
		//5. Click on Login button
		w.findElement(By.name("submit")).click();
		System.out.println("Webpage is Working");
		System.out.println(w.getCurrentUrl());
		System.out.println(w.getTitle());
		w.navigate().back();
		Thread.sleep(2000);		
		
		// SIGN-ON
		w.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).click();
		w.findElement(By.name("userName")).sendKeys("1234");
		w.findElement(By.name("password")).sendKeys("1234");
		w.findElement(By.name("submit")).click();
		System.out.println("Sign-on");
		w.navigate().back();
		w.navigate().back();
		
		
		//REGISTER
		w.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(2000);
		w.findElement(By.linkText("REGISTER")).click();
		w.findElement(By.name("firstName")).sendKeys("S");
		w.findElement(By.name("lastName")).sendKeys("Sangeetha");
		w.findElement(By.name("phone")).sendKeys("1234546789");
		w.findElement(By.name("userName")).sendKeys("sangeetha@gmail.com");
		w.findElement(By.name("address1")).sendKeys("Anna nagar");
		w.findElement(By.name("city")).sendKeys("Chennai");
		w.findElement(By.name("state")).sendKeys("Tamil nadu");
		w.findElement(By.name("postalCode")).sendKeys("600078");
				Select s=new Select(w.findElement(By.name("country")));
				s.selectByIndex(13);
		s.selectByValue("AUSTRIA");
		s.selectByVisibleText("AUSTRIA");
		w.findElement(By.name("email")).sendKeys("sangeetha@gmail.com");
		w.findElement(By.name("password")).sendKeys("1234567");
		w.findElement(By.name("confirmPassword")).sendKeys("1234567");
		w.findElement(By.name("submit")).click();
		w.navigate().back();
		System.out.println("Register");
		Thread.sleep(2000);	
		w.navigate().back();
		
		// SUPPORT
		w.findElement(By.linkText("SUPPORT")).click();
		Thread.sleep(2000);
		w.navigate().back();
		System.out.println("Support");
		Thread.sleep(2000);	
		
		// CONTACT
		w.findElement(By.linkText("CONTACT")).click();
		Thread.sleep(1000);
		w.navigate().back();
		System.out.println("Contact");
		Thread.sleep(1000);	
		
		
		// HOME PAGE
		w.findElement(By.linkText("Home")).click();
	                                      Thread.sleep(2000);
			System.out.println("Home");
	
	
		// Flights
		w.findElement(By.linkText("Flights")).click();
		Thread.sleep(2000);
		w.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]")).click();
		System.out.println("Radio button");
		Select s0=new Select(w.findElement(By.name("passCount")));
		s0.selectByIndex(0);
		Select s1=new Select(w.findElement(By.name("fromPort")));
		s1.selectByIndex(2);
		Select s2=new Select(w.findElement(By.name("fromMonth")));
		s2.selectByIndex(5);
		Select s3=new Select(w.findElement(By.name("fromDay")));
		s3.selectByIndex(14);
		Select s4=new Select(w.findElement(By.name("toPort")));
		s4.selectByIndex(5);
		Select s5=new Select(w.findElement(By.name("toMonth")));
		s5.selectByIndex(6);
		Select s6=new Select(w.findElement(By.name("toDay")));
		s6.selectByIndex(19);
		w.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]")).click();
		Select s7=new Select(w.findElement(By.name("airline")));
		s7.selectByIndex(2);
		w.findElement(By.name("findFlights")).click();
		w.navigate().back();
		System.out.println("Flights");
		Thread.sleep(2000);	
		w.navigate().back();
		
		
		// Hotels
		w.findElement(By.linkText("Hotels")).click();
		Thread.sleep(2000);
		w.navigate().back();
		System.out.println("Hotels");
		Thread.sleep(2000);	
		
		
		// Car Rentals
		w.findElement(By.linkText("Car Rentals")).click();
		Thread.sleep(2000);
		w.navigate().back();
		System.out.println("Car Rentals");
		Thread.sleep(2000);	
		
		
		// Cruises
		w.findElement(By.linkText("Cruises")).click();
		Thread.sleep(2000);
		System.out.println("Cruises");
		Thread.sleep(2000);
		
		
		
		// Destinations
		w.findElement(By.linkText("Destinations")).click();
		Thread.sleep(2000);
		w.navigate().back();
		System.out.println("Destinations");
		Thread.sleep(2000);	
		
		// Vacations
		w.findElement(By.linkText("Vacations")).click();
		Thread.sleep(2000);
		w.navigate().back();
		System.out.println("Vacations");
		Thread.sleep(2000);	
		
		// Selenium 
		w.findElement(By.partialLinkText("Seleni")).click();
		Thread.sleep(2000);
		// Flash Movie Demo
		w.findElement(By.linkText("Flash Movie Demo")).click();
		//w.findElement(By.name("Play")).click();
	                    Thread.sleep(1000);
		w.navigate().back();
		
		// Selenium
		w.findElement(By.partialLinkText("Seleni")).click();
		Thread.sleep(2000);
		// Radio & Checkbox Demo
		w.findElement(By.linkText("Radio & Checkbox Demo")).click();
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"vfb-7-2\"]")).click();
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"vfb-6-0\"]")).click();
		w.navigate().back();
		
		
		// Selenium
		w.findElement(By.partialLinkText("Seleni")).click();
		Thread.sleep(2000);
		// Table Demo
		w.findElement(By.linkText("Table Demo")).click();
		Thread.sleep(2000);
		w.navigate().back();
		
		
		// Selenium
		w.findElement(By.partialLinkText("Seleni")).click();
		Thread.sleep(2000);
		// Accessing Link
		w.findElement(By.linkText("Accessing Link")).click();
		w.findElement(By.linkText("click here")).click();
		Thread.sleep(2000);
		w.navigate().back();
		w.navigate().back();
			
		
		// Selenium
		w.findElement(By.partialLinkText("Seleni")).click();
		Thread.sleep(2000);
		//Ajax Demo
		w.findElement(By.linkText("Ajax Demo")).click();
		Thread.sleep(2000);
		w.findElement(By.name("name")).click();
		w.findElement(By.id("buttoncheck")).click();
		Thread.sleep(2000);
		w.navigate().back();
		
		
		// Selenium
		w.findElement(By.partialLinkText("Seleni")).click();
		Thread.sleep(2000);
		//Inside & Outside Block Level Tag
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[6]/a")).click();
		w.findElement(By.xpath("/html/body/p/a")).click();
		Thread.sleep(2000);
		w.navigate().back();
		w.navigate().back();
		
		
		// Selenium
			w.findElement(By.partialLinkText("Seleni")).click();
			Thread.sleep(2000);
			// Delete Customer Form
			w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[7]/a")).click();
			w.findElement(By.name("cusid")).sendKeys("123");
			w.findElement(By.name("submit")).click();
			//Thread.sleep(2000);
			Thread.sleep(6000);
			Alert A1=w.switchTo().alert();
			A1.accept();
			A1.accept();
			w.navigate().back();
			w.navigate().back();

		// Selenium
		w.findElement(By.partialLinkText("Seleni")).click();
		Thread.sleep(2000);
		// Yahoo
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[8]/a")).click();
		Thread.sleep(2000);
		//w.findElement(By.xpath("//*[@id=\"messenger-download\"]")).click();
		w.navigate().back();
		
		

		// Selenium
		w.findElement(By.partialLinkText("Seleni")).click();
		Thread.sleep(2000);
		// Tooltip
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[9]/a")).click();
		Thread.sleep(2000);
		// w.findElement(By.xpath("//*[@id=\"download_now\"]")).click();
		w.navigate().back();
		
		

		// Selenium
		w.findElement(By.partialLinkText("Seleni")).click();
		Thread.sleep(2000);
		// File Upload
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[10]/a")).click();
		w.findElement(By.name("uploadfile_0")).sendKeys("C:\\Users\\ELCOT\\Pictures\\Saved Pictures\\3637.jpg");
		Thread.sleep(2000);
		w.findElement(By.name("send")).click();
		Thread.sleep(2000);
		w.navigate().back();
		
		
		// Selenium
		w.findElement(By.partialLinkText("Seleni")).click();
		Thread.sleep(2000);
		// Login
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[11]/a")).click();
		Thread.sleep(2000);
		w.findElement(By.name("email")).sendKeys("sangeetha@gmail.com");
		w.findElement(By.name("passwd")).sendKeys("1234567");
		w.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
		w.navigate().back();
		w.navigate().back();
		

		// Selenium
		w.findElement(By.partialLinkText("Seleni")).click();
		Thread.sleep(2000);
		// Social Icon
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[12]/a")).click();
		Thread.sleep(2000);
		w.navigate().back();
		
		// Selenium
		w.findElement(By.partialLinkText("Seleni")).click();
		Thread.sleep(2000);
		// Selenium Auto IT
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[13]/a")).click();
		Thread.sleep(2000);
		w.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor) w;
		js.executeScript("window.scrollTo(0,2000)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-2000)");
		w.navigate().back();
		
		
		// Selenium
		w.findElement(By.partialLinkText("Seleni")).click();
		Thread.sleep(2000);
		// Selenium IDE Test
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[14]/a")).click();
		Thread.sleep(2000);
		w.navigate().back();
		
		// Selenium
		w.findElement(By.partialLinkText("Seleni")).click();
		Thread.sleep(2000);
		// Guru99 Demo Page
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[15]/a")).click();
		Thread.sleep(2000);
		w.navigate().back();
		
		// Selenium
		w.findElement(By.partialLinkText("Seleni")).click();
		Thread.sleep(2000);
		// Scrollbar 
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[16]/a")).click();
		Thread.sleep(2000);
		w.manage().window().maximize();
		WebElement Element = w.findElement(By.xpath("//*[@id=\"rt-feature\"]/div/div[1]/div/div/div/div/div[6]/div/div/div/div/div[1]/div/div/a/I"));
		JavascriptExecutor js1 =(JavascriptExecutor) w;
		js1.executeScript("arguments[0].scrollIntoView();",Element);
		w.navigate().back();
		
		
		// Selenium
		w.findElement(By.partialLinkText("Seleni")).click();
		Thread.sleep(2000);
		// File Upload Using Sikuli Demo
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[17]/a")).click();
		w.findElement(By.xpath("//*[@id=\"photoimg\"]")).sendKeys("C:\\Users\\ELCOT\\Pictures\\Saved Pictures\\3637.jpg");
		Thread.sleep(2000);
		w.navigate().back();
		
		
		// Selenium
		w.findElement(By.partialLinkText("Seleni")).click();
		Thread.sleep(2000);
		// Cookies Handling Demo
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[18]/a")).click();
		Thread.sleep(2000);
		w.findElement(By.name("username")).sendKeys("sangeetha@gmail.com");
		w.findElement(By.name("password")).sendKeys("1234567");
		w.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		w.navigate().back();
		w.navigate().back();
		
		
		// Selenium
		w.findElement(By.partialLinkText("Seleni")).click();
		Thread.sleep(2000);
		//Drag and Drop Action
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[19]/a")).click();
		Thread.sleep(2000);
		WebElement Drag=w.findElement(By.partialLinkText("BANK"));
		WebElement Drop=w.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		Actions act=new Actions(w);
		act.dragAndDrop(Drag, Drop).build().perform();
		
		
		WebElement Drag1=w.findElement(By.partialLinkText("5000"));
		WebElement Drop1=w.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		Actions act1=new Actions(w);
		act1.dragAndDrop(Drag1, Drop1).build().perform();
	
		
		WebElement Drag2=w.findElement(By.partialLinkText("SALES"));
		WebElement Drop2=w.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		Actions act2=new Actions(w);
		act2.dragAndDrop(Drag2, Drop2).build().perform();
		
		
		WebElement Drag3=w.findElement(By.partialLinkText("5000"));
		WebElement Drop3=w.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		Actions act3=new Actions(w);
		act3.dragAndDrop(Drag3, Drop3).build().perform();
		Thread.sleep(3000);
		w.navigate().back();
		
		
				
		// Selenium
		w.findElement(By.partialLinkText("Seleni")).click();
		Thread.sleep(2000);
		// Selenium DatePicker Demo
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[20]/a")).click();
		Thread.sleep(2000);
		w.findElement(By.name("bdaytime")).click();
		w.findElement(By.tagName("input")).click();
		w.findElement(By.xpath("/html/body/form/input[2]")).click();
		w.navigate().back();
		w.navigate().back();
		
				
			
		// Insurance Project
		w.findElement(By.partialLinkText("Insurance Project")).click();
		Thread.sleep(3000);
		w.findElement(By.name("email")).sendKeys("sangeetha@gmail.com");
		w.findElement(By.name("password")).sendKeys("1234567");
		w.findElement(By.name("submit")).click();
		w.navigate().back();
		w.navigate().back();
		
		
		
		// Agile Project
		w.findElement(By.partialLinkText("Agile Project")).click();
		Thread.sleep(3000);
		w.findElement(By.name("uid")).sendKeys("1234");
		w.findElement(By.name("password")).sendKeys("1234567");
		Thread.sleep(3000);
		w.findElement(By.name("btnReset")).click();
		w.navigate().back();
		
		
		// Bank Project
		w.findElement(By.partialLinkText("Bank Project")).click();
		Thread.sleep(3000);
		w.findElement(By.name("uid")).sendKeys("1234");
		w.findElement(By.name("password")).sendKeys("1234567");
		Thread.sleep(3000);
		w.findElement(By.name("btnReset")).click();
		w.navigate().back();
		
		// Security project
		w.findElement(By.partialLinkText("Security Project")).click();
		Thread.sleep(3000);
		w.findElement(By.name("uid")).sendKeys("1234");
		w.findElement(By.name("password")).sendKeys("1234567");
		Thread.sleep(3000);
		w.findElement(By.name("btnReset")).click();
		w.navigate().back();
		
		// Telecom Project
		w.findElement(By.partialLinkText("Telecom Project")).click();
		Thread.sleep(3000);
		w.navigate().back();
		
		// Payment Gateway Project
		w.findElement(By.partialLinkText("Payment Gateway Project")).click();
		Thread.sleep(3000);
		w.navigate().back();
		
		
		// New Tours
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[10]/a")).click();
		Thread.sleep(2000);
		
		
		// SEO
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[11]/a")).click();
		Thread.sleep(3000);
		w.findElement(By.linkText("Page-1")).click();
		Thread.sleep(3000);
		w.navigate().back();
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[11]/a")).click();
		Thread.sleep(3000);
		w.findElement(By.linkText("Page-2")).click();
		Thread.sleep(3000);
		w.navigate().back();
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[11]/a")).click();
		Thread.sleep(3000);
		w.findElement(By.linkText("Page-3")).click();
		Thread.sleep(3000);
		w.navigate().back();
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[11]/a")).click();
		Thread.sleep(3000);
		w.findElement(By.linkText("Page-4")).click();
		Thread.sleep(3000);
		w.navigate().back();
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[11]/a")).click();
		Thread.sleep(3000);
		w.findElement(By.linkText("Page-5")).click();
		Thread.sleep(3000);
		w.navigate().back();
		w.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[11]/a")).click();
		Thread.sleep(3000);
		w.findElement(By.linkText("Page-6")).click();
		Thread.sleep(3000);
		w.navigate().back();

	}

}


