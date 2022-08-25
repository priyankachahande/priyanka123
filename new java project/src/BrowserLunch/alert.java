package BrowserLunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver object = new ChromeDriver();
		object.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		object.manage().window().maximize();
		object.findElement(By.xpath("//*[@name='alert']")).click();
		Thread.sleep(2000);
		object.switchTo().alert().accept();
		object.findElement(By.xpath("//*[@name='confirmation']")).click();
		Thread.sleep(2000);
		object.switchTo().alert().dismiss();
		object.findElement(By.xpath("//*[@name='prompt']")).click();
		Thread.sleep(2000);
		object.switchTo().alert().sendKeys("priyanka");
		object.switchTo().alert().accept();
		object.close();
				
	}
}
