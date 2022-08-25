package BrowserLunch;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class LoginLogout {
	//public static void main(String[] args) throws InterruptedException
	public static void main(String[] args) throws InterruptedException

	{
		WebDriver driver;
		System.setProperty("webdriverChrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver1.manage().window().maximize();
		driver1.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
		//driver.findElement(By.cssSelector(".textInputContainer input")).get(1).sendKeys("admin123");
		driver1.findElement(By.cssSelector(".textInputContainer input").get(1)).sendKeys("Admin123");
		driver1.findElement(By.cssSelector("#btnLogin")).click();
		boolean result = driver1.findElement(By.cssSelector(".main-menu-first-level-list-item")).getText().contains("admin");
		System.out.println(result);
		driver1.findElement(By.id("welcome")).click();
		Thread.sleep(200);
		driver1.findElement(By.partialLinkText("log")).click();
	}
}
