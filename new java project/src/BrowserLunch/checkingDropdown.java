package BrowserLunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkingDropdown {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().minimize();
		WebElement txtboxUserName = driver.findElement(By.id("txtUsername"));
		txtboxUserName.sendKeys("Admin");
		WebElement txtboxUserPasword = driver.findElement(By.id("txtPassword"));
		txtboxUserPasword.sendKeys("txtPassword");
		WebElement btnLogin = driver.findElement(By.id("btnLogin"));
		btnLogin.click();
		//driver.findElement(By.cssSelector("//*[@id='menu_admin_viewAdminModule']"));
		//driver.quit();
		driver.close();
	}
}
