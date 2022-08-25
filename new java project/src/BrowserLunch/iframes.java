package BrowserLunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class iframes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver object = new ChromeDriver();
		object.get("https://jqueryui.com/slider/");
		object.manage().window().maximize();
		WebElement iframe = object.findElement(By.xpath("//*[@class='demo-frame']"));
		object.switchTo().frame(iframe);
		WebElement slider = object.findElement(By.id("slider"));
		Thread.sleep(500);
		Actions act =new Actions(object);
		act.clickAndHold(slider).perform();
		
	}

}
