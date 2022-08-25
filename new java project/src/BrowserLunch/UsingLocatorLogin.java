package BrowserLunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLocatorLogin {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.Chrome.Driver","C:\\selenium\\chromedriver_win32\\chomedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().minimize();
		WebElement txtBoxUserName = driver.findElement(By.name("txtUsername"));
		txtBoxUserName.sendKeys("Admin");
		WebElement txtBoxPassword = driver.findElement(By.name("txtPassword"));
		txtBoxPassword.sendKeys("admin123");
		WebElement btnLogin = driver.findElement(By.id("btnLogin")); 
		btnLogin.click();
		driver.close();
	}
}
