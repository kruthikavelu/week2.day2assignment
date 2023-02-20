package week2.day2assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		/*http://leaftaps.com/opentaps/control/main
//		
//		* 1	Launch the browser
//		* 2	Enter the username
//		* 3	Enter the password
//		* 4	Click Login
//		* 5	Click crm/sfa link
//		* 6	Click Leads link
//		* 7	Click Find leads
//		* 8	Enter first name
//		* 9	Click Find leads button
//		* 10 Click on first resulting lead
//		* 11 Verify title of the page
//		* 12 Click Edit
//		* 13 Change the company name
//		* 14 Click Update
//		* 15 Confirm the changed name appears
//		* 16 Close the browser (Do not log out)
//*/
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[contains(@name,'firstName')])[3]")).sendKeys("Kruthika");
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
		String title= driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("   Testleaf chennai");
		driver.findElement(By.className("smallSubmit")).click();
		WebElement dd=driver.findElement(By.id("viewLead_companyName_sp"));
		String text=dd.getText();
		System.out.println("" + text);
		driver.close();
	}

}
