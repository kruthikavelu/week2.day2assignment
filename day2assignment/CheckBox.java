package week2.day2assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		https://www.leafground.com/checkbox.xhtml
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'col-12')])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		driver.findElement(By.xpath("//label[text()='Python']")).click(); 
	    driver.findElement(By.xpath("//label[text()='Others']")).click(); 
		driver.findElement(By.xpath("(//div[contains(@class,'grid formgrid')])[4]")).click();
		 boolean result = driver.findElement(By.xpath("(//div[@class='ui-helper-hidden-accessible']/input)[21]")).isEnabled();
		 System.out.println(result);
		 driver.close();
		
	}

}
