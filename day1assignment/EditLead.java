package week2.day1assignment;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.Select;

		public class EditLead {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
//				1. Launch URL "http://leaftaps.com/opentaps/control/login"
//				  2. Enter UserName and Password Using Id Locator
//				  3. Click on Login Button using Class Locator
//				  4. Click on CRM/SFA Link
//				  5. Click on Leads Button
//				  6. Click on Create Lead 
//				  7. Enter CompanyName Field Using id Locator
//				  8. Enter FirstName Field Using id Locator
//				  9. Enter LastName Field Using id Locator
//				  10. Enter FirstName(Local) Field Using id Locator
//				  11. Enter Department Field Using any Locator of Your Choice
//				  12. Enter Description Field Using any Locator of your choice 
//				  13. Enter your email in the E-mail address Field using the locator of your choice
//				  14. Select State/Province as NewYork Using Visible Text
//				  15. Click on Create Button
//		                16. Click on edit button
//		                17. Clear the Description Field using .clear()
//				  18. Fill ImportantNote Field with Any text
//				  19. Click on update button 
//				  20. Get the Title of Resulting Page. refer the video  using driver.getTitle()
				
				
				ChromeDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://leaftaps.com/opentaps/control/login");
				driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Create Lead")).click();
				//create Lead
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kruthika");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Velusamy");
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Keerthi");
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("EEE");
				driver.findElement(By.id("createLeadForm_description")).sendKeys("Joined in a TestLeaf Guider");
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kruthikavelusamy@gmail.com");
				WebElement element = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		// select dropdown 		
				Select dropdown =new Select(element);
				dropdown.selectByVisibleText("New York");
				driver.findElement(By.xpath("//input[contains(@class,'smallSubmit')]")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
				//clear the description field and update
				driver.findElement(By.id("updateLeadForm_description")).clear();
				driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Joined Testleaf as a fresher");
				driver.findElement(By.xpath("//input[contains(@class,'smallSubmit')]")).click();
				String title=driver.getTitle();
				System.out.println(title);
				
				
			}
	}


