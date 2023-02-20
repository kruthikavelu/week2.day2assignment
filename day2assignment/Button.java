package week2.day2assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		https://www.leafground.com/button.xhtml
//			1. Click and Confirm title
//			2. Confirm if the button is disabled
//			3. Find the position of the Submit button
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/button.xhtml");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[contains(@class,'ui-button-text ui-c')])[1]")).click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.navigate().back();
		Thread.sleep(2000);
		boolean button=driver.findElement(By.xpath("(//span[contains(@class,'ui-button-text ui-c')])[2]")).isEnabled();
		System.out.println(button);
		Thread.sleep(3000);
		Point location=driver.findElement(By.xpath("(//span[contains(@class,'ui-button-text ui-c')])[3]")).getLocation();
		System.out.println(location);
		driver.close();
	}

}
