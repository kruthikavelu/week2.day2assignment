package week2.day2assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		https://www.leafground.com/input.xhtml
//			1. Type your name
//			2. Append Country to this City
//			3. Verify if text box is disabled
//			4. Clear the typed text
//			5. Retrieve the typed text
//			6. Type email and Tab. Confirm control moved to next element
//			7. Type about yourself
//			8. Text Editor
//			9. Just Press Enter and confirm error message*
//			10. Click and Confirm Label Position Changes
//			11. Type your name and choose the third option
//			12. Click and Confirm Keyboard appears
//			13. Custom Toolbar
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.leafground.com/input.xhtml");
driver.findElement(By.xpath("//div[@class='col-12']/input")).sendKeys("Kruthika");
driver.findElement(By.xpath("(//div[@class='col-12']/input)[2]")).sendKeys("India");
System.out.println(driver.findElement(By.xpath("(//div[@class='col-12']/input)[3]")).isEnabled());
driver.findElement(By.xpath("(//div[@class='col-12']/input)[4]")).clear();
System.out.println(driver.findElement(By.xpath("(//div[@class='col-12']/input)[5]")).getAttribute("value"));
driver.findElement(By.xpath("(//div[@class='col-12']/input)[6]")).sendKeys("Keerthi@gmail.com");
driver.findElement(By.xpath("(//div[@class='col-12']/input)[6]")).sendKeys(Keys.TAB);
driver.findElement(By.xpath("//div[@class='col-12']/textarea")).sendKeys("Love to Learn");
driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys("hello");
driver.findElement(By.xpath("//div[@class='col-12 mb-2 lg:col-8']/input")).sendKeys("hii");
Thread.sleep(3000);
driver.findElement(By.xpath("//span[@class='ui-float-label']/input")).click();
driver.findElement(By.xpath("//li[@class='ui-autocomplete-input-token']/input")).sendKeys("Happy Coding");
driver.findElement(By.xpath("//li[@class='ui-autocomplete-item ui-autocomplete-list-item ui-corner-all']/span)[4]")).click();
driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']/p")).sendKeys("love to code");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[text()='Close']")).click();
driver.close();
	}

}
