package week2.day2assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		/*http://leaftaps.com/opentaps/control/main
//		 
//		Delete Lead:
//		1	Launch the browser
//		2	Enter the username
//		3	Enter the password
//		4	Click Login
//		5	Click crm/sfa link
//		6	Click Leads link
//		7	Click Find leads
//		8	Click on Phone
//		9	Enter phone number
//		10	Click find leads button
//		11	Capture lead ID of First Resulting lead
//		12	Click First Resulting lead
//		13	Click Delete
//		14	Click Find leads
//		15	Enter captured lead ID
//		16	Click find leads button
//		17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
//		18	Close the browser (Do not log out)
//*/
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
		System.out.println(driver.getCurrentUrl());
	    driver.findElement(By.linkText("Leads")).click();
	    System.out.println(driver.getCurrentUrl());
	    driver.findElement(By.linkText("Find Leads")).click();
	    driver.findElement(By.xpath("//span[text()='Phone']")).click();
	    driver.findElement(By.name("phoneNumber")).sendKeys("9944451515");
	    driver.findElement(By.linkText("Find Leads")).click();
	    Thread.sleep(2000);
	    //click on the first resulting leads
	    String text=driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]/a")).getText();
	    System.out.println(text);
	    driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]/a")).click();
	    driver.findElement(By.xpath("//a[text()='Delete']")).click();
	    driver.findElement(By.linkText("Find Leads")).click();
	    Thread.sleep(3000);
	    //enter the captured id
	    driver.findElement(By.xpath("//input[contains(@name,'id')]")).sendKeys(text);
	    driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
//	    WebElement where = driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]"));
//	    boolean isVisible = where.isDisplayed();
	    driver.close();
	}

}
