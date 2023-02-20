package week2.day2assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		/*http://leaftaps.com/opentaps/control/main
//		 
//		1	Launch the browser
//		2	Enter the username
//		3	Enter the password
//		4	Click Login
//		5	Click crm/sfa link
//		6	Click Leads link
//		7	Click Find leads
//		8	Click on Email
//		9	Enter Email
//		10	Click find leads button
//		11	Capture name of First Resulting lead
//		12	Click First Resulting lead
//		13	Click Duplicate Lead
//		14	Verify the title as 'Duplicate Lead'
//		15	Click Create Lead
//		16	Confirm the duplicated lead name is same as captured name
//		17	Close the browser (Do not log out)
//		
//		*/
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
	    //Capture name of First Resulting lead
	    WebElement loadA =driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner x-grid3-col-firstName')])/a"));
	    String text=loadA.getText();
	    loadA.click();
	    //Click Duplicate Lead
	    driver.findElement(By.linkText("Duplicate Lead")).click();
	    String title = driver.getTitle();
	    System.out.println(title);
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[contains(@name,'submitButton')]")).click();
	    //Confirm the duplicated lead name is same as captured name
	    WebElement loadB=driver.findElement(By.id("viewLead_companyName_sp"));
	    String text1=loadB.getText();
	    System.out.println("actual and duplicate " + text + text1);
	    //close the browser
	    driver.close();
	   
	}

}
