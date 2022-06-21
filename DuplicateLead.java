package week2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class DuplicateLead extends Baseclass{
@Test
	public void duplicate() {
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Find Leads")).click();
driver.findElement(By.linkText("Email")).click();
driver.findElement(By.name("emailAddress")).sendKeys("priyakrish25790@gmail.com");
driver.findElement(By.xpath("//td[@class='x-btn-center']//button[@class='x-btn-text']")).click();
WebElement leadId = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
String leadId1 = leadId.getText();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
System.out.println(leadId1);
leadId.click();
driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a")).click();
}}
