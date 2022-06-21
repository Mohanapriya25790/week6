package week2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import week5.Readexcel;

public class Baseclass {
	public ChromeDriver driver;
@Parameters({"url","username","password"})
@BeforeMethod
public void pre(String url,String name,String pwd) {
	
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys(name);
	driver.findElement(By.id("password")).sendKeys(pwd);
	   driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();

}
   
@AfterMethod
public void post() {
driver.close();
}
@DataProvider(name = "dats")
public String[][] fetchData() throws IOException  {
	return Readexcel.read();
	}}
