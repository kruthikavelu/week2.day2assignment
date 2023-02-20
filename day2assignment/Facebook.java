package week2.day2assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				// Step 1: Launch the chromebrowser
				// Step 2: Load the URL https://en-gb.facebook.com/
				// Step 3: Maximise the window
				// Step 4: Add implicit wait
				// Step 5: Click on Create New Account button
				// Step 6: Enter the first name
				// Step 7: Enter the last name
				// Step 8: Enter the mobile number
				// Step 9: Enterthe password
				// Step 10: Handle all the three drop downs
				// Step 11: Select the radio button "Female" 
				          //  ( A normal click will do for this step)
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Kruthika");
		driver.findElement(By.name("lastname")).sendKeys("Velusamy");
		driver.findElement(By.name("reg_email__")).sendKeys("9788812121");
		driver.findElement(By.name("reg_passwd__")).sendKeys("K@95");
		WebElement element=driver.findElement(By.id("day"));
		Select dd=new Select(element);
		dd.selectByVisibleText("8");
		WebElement element1=driver.findElement(By.id("month"));
		Select dd1=new Select(element1);
		dd1.selectByVisibleText("Mar");
		WebElement element2=driver.findElement(By.id("year"));
		Select dd2=new Select(element2);
		dd2.selectByVisibleText("2023");
		driver.findElement(By.xpath("//label[text()='Female']")).click();           
	}

}
