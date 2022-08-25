package BrowserLunch;

import java.awt.Window;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxgetwindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		
		String ID1 = driver.getWindowHandle();
		System.out.println(ID1);

		driver.findElement(By.xpath("//*[@text='OrangeHRM, Inc']")).click();
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();

		driver.findElement(By.xpath("//*[@text='OrangeHRM, Inc']")).click();
		Set<String> ALLID = driver.getWindowHandles();
		 for(String SingleWindow : ALLID)
		 {
			 if(!Window.equals(SingleWindow)) 
				 if(!window.equals(singlewindow))
			 {
			 Thread.sleep(1000);
			 driver.switchTo().window(SingleWindow);
			 Thread.sleep(500);
			 driver.findElement(By.xpath("//*[@text='Contact Sales']"));
			 }
		 }
	}

}
