package RunningTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart {
	
	static WebElement ele = null;
	
	

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hgopi\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
	//	System.out.println(driver.findElement(By.xpath("//input[contains(@class,'_2IX_2-')][@type='text']")).getText()); - example for getText
	//	WebElement ele = driver.findElement(By.xpath("//div[@class='go_DOp']//div[@class='exehdJ']"));
		Actions ac = new Actions(driver);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[contains(@class,'_2IX_2-')][@type='text']")).sendKeys("7032833674");
		driver.findElement(By.xpath("//input[contains(@class,'_2IX_2-')][@type='password']")).sendKeys("7416gopi");
		driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2HKlqd')][@type='submit']")).click();
		Thread.sleep(3000);
	//	driver.navigate().to("https://www.flipkart.com/account/?rd=0&link=home_account");
		ac.moveToElement(driver.findElement(By.xpath("//div[@class='go_DOp']//div[@class='exehdJ']"))).pause(2000).build().perform();
		ac.moveToElement(driver.findElement(By.xpath("//div[text()='Logout']"))).click().build().perform();
	//	ac.moveToElement(ele).clickAndHold().pause(2000).moveToElement(driver.findElement(By.xpath("//div[contains(text(), 'Logout')]"))).click().build().perform();
	//	driver.findElement(By.xpath("//span[text()='Logout']")).click();
	}

}
