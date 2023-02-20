package week2.day2assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		https://www.leafground.com/radio.xhtml
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//label[text()='Chrome']")).click();
		driver.findElement(By.xpath("//label[text()='Bengaluru']")).click();
		driver.findElement(By.xpath("//label[text()='Safari']")).isSelected();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='21-40 Years']")).isSelected();
		Thread.sleep(2000);
		driver.close();
	}

}
