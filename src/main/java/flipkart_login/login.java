package flipkart_login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class login {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver.exe");
		// WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		/*
		 * driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys(
		 * "9096177947");
		 * driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).
		 * click(); driver.findElement(By.id("FLJJOmGlxaaFKUR")).click();
		 */
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobiles");
		Thread.sleep(3000);
		// driver.findElement(By.xpath("")).click();
		WebElement linktext = driver
				.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
		Actions action = new Actions(driver);
		// action.contextClick(linktext).build().perform();
		/*
		 * Robot robot = new Robot(); robot.keyPress(KeyEvent.VK_DOWN);]k[
		 * robot.keyRelease(KeyEvent.VK_DOWN); robot.keyPress(KeyEvent.VK_DOWN);
		 * robot.keyRelease(KeyEvent.VK_DOWN); robot.keyPress(KeyEvent.VK_DOWN);
		 * robot.keyRelease(KeyEvent.VK_DOWN); robot.keyPress(KeyEvent.VK_ENTER);
		 * robot.keyRelease(KeyEvent.VK_ENTER);
		 */
		action.sendKeys(Keys.DOWN).build().perform();
		action.sendKeys(Keys.DOWN).build().perform();
		// action.sendKeys(Keys.DOWN).build().perform();
		// action.sendKeys(Keys.DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		action.moveByOffset(100, 200).build().perform();
		Thread.sleep(2000);
		// JavascriptExecutor js = (JavascriptExecutor)driver;
		// ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,250)","");
		// js.executeScript("window.scrollBy(0,1500)");
		driver.findElement(By.className("_4rR01T")).click();

		// WebElement scroll =
		// driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[8]/div[2]/div/div/div/div/div/img[2]"));
		// js.executeScript("arguments[0].scrollIntoView();", scroll);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button"))
				.click();
		

	}

}
