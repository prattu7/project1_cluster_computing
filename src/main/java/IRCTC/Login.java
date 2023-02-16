package IRCTC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\src\\test\\resources\\chromedriver.exe");
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		
				//WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			    
				
				driver.get("https://www.redbus.in/");
			
				driver.manage().window().maximize();
				//WebDriverWait wait = new WebDriverWait(driver, 10);
				//Alert alert = driver.switchTo().alert();
				//String alertMessage= driver.switchTo().alert().getText();
				Actions action = new Actions(driver);
				WebElement from = driver.findElement(By.xpath("//*[@id=\"src\"]"));
				from.sendKeys("Nagpur");
				Thread.sleep(2000);
				action.sendKeys(Keys.DOWN).build().perform();
				action.sendKeys(Keys.ENTER).build().perform();
				
				Thread.sleep(2000);
				
				Actions action1 = new Actions(driver);
				WebElement to = driver.findElement(By.xpath("//*[@id=\"dest\"]"));
				to.sendKeys("Mumbai");
				
				Thread.sleep(2000);
				
				action1.sendKeys(Keys.DOWN).build().perform();
				action1.sendKeys(Keys.ENTER).build().perform();
				
				
				//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='src']/following-sibling::ul/li[2]"))));
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div//tr//td[@class='current day']")).click();
				Thread.sleep(3000);
				driver.findElement(By.id("onward_cal")).click();
				driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
				driver.findElement(By.xpath("(//div//tr//td[@class='wd day'])[23]")).click();
				
				driver.findElement(By.xpath("//div//button[contains(text(),'Search Buses')]")).click();
				Thread.sleep(3000);
				
				WebElement scroll=driver.findElement(By.xpath("//*[@id=\"15307651\"]/div/div[2]/div[1]"));
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,250)");
				
				
				//((JavascriptExecutor)driver).executeScript("arguents[0].scrollIntoView();", driver.findElement(By.xpath("//div[@class='button view-seats fr']")));
				//js.executeScript("document.querySelector(scroll).scrolright=100");
				
				driver.findElement(By.xpath("//div[@class='button view-seats fr']")).click();
				
				js.executeScript("window.scrollBy(0,250)");
				Thread.sleep(3000);
				js.executeScript("window.scrollBy(0,400)");
				Thread.sleep(1000);
				js.executeScript("window.scrollBy(0,-200)");

	}

}
