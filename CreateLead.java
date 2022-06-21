package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class CreateLead extends Baseclass {
@Test(dataProvider="dats")
	public void lead(String Cname,String fName,String Lname) {		
driver.findElement(By.linkText("Leads")).click();
//driver.findElement(By.linkText("Find_Lead")).click();
//driver.findElement(By.xpath("//td class//a")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Cname);
driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
driver.findElement(By.id("createLeadForm_lastName")).sendKeys(Lname);
WebElement ele= driver.findElement(By.id("createLeadForm_dataSourceId"));
Select sele= new Select(ele);
sele.selectByIndex(2);
driver.findElement(By.name("submitButton")).click();
}}
