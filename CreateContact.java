package week2;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class CreateContact extends Baseclass  {
@Test
	public  void create() throws InterruptedException   {
driver.findElement(By.linkText("Contacts")).click();
driver.findElement(By.linkText("Create Contact")).click();
driver.findElement(By.id("firstNameField")).sendKeys("Mohana Priya");
driver.findElement(By.id("lastNameField")).sendKeys("Gopalakrishnan");
//driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Priya25");
//driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("krish");
//driver.findElement(By.name("description")).sendKeys("non-IT April Batch 2022");
Thread.sleep(3000);
//driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("priyakrish25790@gmail.com");
//WebElement drop= driver.findElement(By.name("generalStateProvinceGeoId"));
//Select down= new Select(drop);
//down.selectByValue("NY");
driver.findElement(By.name("submitButton")).click();
//driver.findElement(By.xpath("//div[@class=\"frameSectionExtra\"]/a")).click();
//driver.findElement(By.name("description")).clear();
//driver.findElement(By.name("importantNote")).sendKeys("non-IT April Batch 2022");
//driver.findElement(By.xpath("//td/input[@name=\"submitButton\"]")).click();
//System.out.println("The Title is :"+driver.getTitle());
}}
