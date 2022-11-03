package projecthrm;
import org.testng.annotations.Test;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class hrm {
	WebDriver driver;

	@BeforeTest
	public void launhbrowser() throws InterruptedException {


		// TODO Auto-generated constructor stub
		System.setProperty("Webdriver.chrome.driver","C:\\selenium");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(5000);

	}
	@Test
	public void hrm() throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Admin")).click();
		Thread.sleep(3000);
	/* driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]")).click();
		List <WebElement> userrole=driver.findElements(By.xpath("//div[@class='oxd-select-option']"));
		String struser;
		for(int i=0;i<userrole.size();i++) {
			struser=userrole.get(i).getText();
			if(struser.equals("Admin")) {
				userrole.get(i).click();
				Thread.sleep(3000);
			}
		} */
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
		driver.findElement(By.xpath("//div[@class='oxd-select-text-input']")).click();
		List<WebElement> userr=driver.findElements(By.xpath("//div[@class='oxd-select-option']"));
		String strname;
		for(int j=0;j<userr.size();j++) {
			strname=userr.get(j).getText();
			if(strname.equals("Admin")) {
				userr.get(j).click();
				Thread.sleep(3000); 
			}
		} 
		driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active oxd-select-text--error']")).click();
		List<WebElement> status=driver.findElements(By.xpath("//div[@class='oxd-select-option']"));
		String strstatus;
		for(int k=0;k<status.size();k++) {
		strstatus=status.get(k).getText();
		if(strstatus.equals("Enabled")) {
			status.get(k).click();
		}}
		Thread.sleep(3000);
		driver.close();
	}
}



