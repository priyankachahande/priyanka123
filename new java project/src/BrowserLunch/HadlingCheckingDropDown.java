package BrowserLunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HadlingCheckingDropDown {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mbasic.facebook.com");
		//driver.manage().window().minimize();
		driver.findElement(By.cssSelector("signup-button input")).click();
		Thread.sleep(1000);
		driver.close();
	}
}
