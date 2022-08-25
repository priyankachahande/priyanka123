package BrowserLunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nevigatefacebookpage {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(200);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		WebElement valueCheckAddress= driver.findElement(By.xpath("//*[contains(text(),'LOGIN')]"));
		String value = valueCheckAddress.getText();
		System.out.println(value);
		
		//driver.close();
	}
}
