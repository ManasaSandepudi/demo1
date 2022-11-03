package selenium;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.*;
import org.testng.annotations.*;
public class webelementmethods {

	WebDriver driver;
	
	public webelementmethods(WebDriver driver)
	 {
		this.driver=driver;
	}
	By username=By.id("email");
	By password=By.id("pass");
	By login=By.name("login");
	public void username() {
		driver.findElement(username).sendKeys("sathviksharma17@gmail.com");
	}
	public void password() {
		driver.findElement(password).sendKeys("Msdhoni@icctrophies");
		driver.findElement(login).click();
		}
}
	/*	System.setProperty("Webdriver.chrome.driver","C:\\selenium");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercurytravels.co.in");
		Thread.sleep(6000);
	} */

/*	@Test
	public void login() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(4000);
		//to scroll by limit of data 
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(5000);
		//to scroll end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		//to scroll upto one selected element
	    js.executeScript("document.getElementByclass('small_tittle').scrollIntoView()");
		Thread.sleep(5000);
		
	}
	@AfterTest
	public void bye() {
		driver.close();

	}} */