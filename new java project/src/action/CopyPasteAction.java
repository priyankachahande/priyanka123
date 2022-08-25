package action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPasteAction {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver object= new ChromeDriver();
		object.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		object.manage().window().maximize();
		WebElement sourceText = object.findElement(By.xpath("//*[@name='firstname']"));
		WebElement targetText = object.findElement(By.xpath("//*[@name='lastname']"));
		
		Actions act = new Actions(object);
		act.sendKeys(sourceText,"priyanka").keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(1000);
		targetText.click();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		object.close();
		
	}
}
