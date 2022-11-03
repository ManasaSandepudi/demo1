package selenium2;
import selenium.*;
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
public class  selenium2 {
WebDriver driver;
@Test
public void Test() throws InterruptedException {
	System.setProperty("Webdriver.chrome.driver","C:\\selenium");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	Thread.sleep(5000);
	webelementmethods loginonce=new webelementmethods(driver);
	loginonce.username();
	loginonce.password();
}

		// TODO Auto-generated constructor stub
	}


