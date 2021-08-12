package RunningTasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart2 {
	
	static WebDriverWait wt;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\users\\hgopi\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		wt = new WebDriverWait(driver, 60);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='IiD88i _351hSN']//input[@type='text']")).sendKeys("7032833674");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("7416gopi");
		driver.findElement(By.xpath("//div[@class='_1D1L_j']//button[@type='submit']")).click();
		Actions tv = new Actions(driver);
		/*
		 * wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(
		 * "(//div[@class='xtXmba'])[3]"))));
		 * tv.moveToElement(driver.findElement(By.xpath("(//div[@class='xtXmba'])[3]")))
		 * .click().build().perform();
		 */
		
		wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]"))));
		tv.moveToElement(driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]"))).pause(3000).build().perform();
	//	tv.moveToElement(driver.findElement(By.xpath("//a[starts-with(@href,'https://www.flipkart.com/mens-footwear/')]").click().pause(2000).build().perform();
//		tv.moveToElement(driver.findElement(By.xpath("(//a[contains(@href='https://www.flipkart.com/mens-footwear/pr?')]"))).click().pause(2000).build().perform();

	}

}
