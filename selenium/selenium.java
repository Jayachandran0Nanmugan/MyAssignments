package learn.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selenium {

	public static void main(String[] args) {
						
				ChromeDriver driver = new ChromeDriver();
				
				driver.get("http://leaftaps.com/opentaps/control/main");
				driver.manage().window().maximize();
				//driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				driver.findElement(By.xpath("//input[@class='inputLogin']")).sendKeys("demosalesmanager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				//driver.close();
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Create Lead")).click();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("JAYACHANDRAN");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("N");
				driver.findElement(By.id("createLeadForm_dataSourceId")).click();
				WebElement findElement = driver.findElement(By.id("createLeadForm_dataSourceId"));
				Select source = new Select(findElement);
				source.selectByIndex(1);
				driver.findElement(By.id("createLeadForm_marketingCampaignId")).click();
			    WebElement findElement2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
			    Select Market = new Select(findElement2);
			    Market.selectByValue("CATRQ_AUTOMOBILE");
			    driver.findElement(By.id("createLeadForm_industryEnumId")).click();
			    WebElement findElement3 = driver.findElement(By.id("createLeadForm_industryEnumId"));
			    Select industry = new Select(findElement3);
			    industry.selectByVisibleText("Computer Software");
			    driver.findElement(By.className("smallSubmit")).click();
			    String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
			    System.out.println("Enrollment No is - "+text);
			    
					}

}
