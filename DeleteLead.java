package week2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class DeleteLead extends Baseclass {
@Test
	public void delete() {
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Find Leads")).click();
driver.findElement(By.linkText("Phone")).click();
driver.findElement(By.xpath("//div[@class='x-plain-body x-plain-body-noheader x-plain-body-noborder']/input[@name='phoneNumber']")).sendKeys("99");
driver.findElement(By.xpath("//td[@class='x-btn-center']//button[@class='x-btn-text']")).click();
WebElement leadId = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
String leadId1 = leadId.getText();		
System.out.println(leadId1);
leadId.click();
driver.findElement(By.className("subMenuButtonDangerous")).click();
driver.findElement(By.linkText("Find Leads")).click();
driver.findElement(By.linkText("Name and ID")).click();
driver.findElement(By.xpath("//div[@class='x-form-element']/input[@name='id']")).sendKeys("10097");
driver.findElement(By.xpath("//td[@class='x-btn-center']//button[@class='x-btn-text']")).click();
if(driver.findElement(By.className("x-paging-info")).isDisplayed()) {
System.out.println("No Records to Display");
}else {
System.out.println("Records to Display");
}}}
