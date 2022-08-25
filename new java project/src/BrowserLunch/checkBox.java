package BrowserLunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver object = new ChromeDriver();
		object.get("https://opensource-demo.orangehrmlive.com/");
		object.manage().window().maximize();
		object.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		object.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		object.findElement(By.xpath("//*[@id='btnLogin']")).click();
		
		object.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
		object.findElement(By.xpath("//*[@id='menu_admin_UserManagement']")).click();
		object.findElement(By.xpath("//*[text()='Users']")).click();
		object.findElement(By.xpath("//*[text()='adash']//parent::td//parent::tr//td//input")).click();

		//*[text()='adash']//parent::td//parent::tr//td//input
		//object.close();
	}

}
