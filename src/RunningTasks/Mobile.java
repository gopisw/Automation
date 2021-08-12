package RunningTasks;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mobile {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hgopi\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='IiD88i _351hSN']//input[@type='text']")).sendKeys("7032833674");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("7416gopi");
		driver.findElement(By.xpath("//div[@class='_1D1L_j']//button[@type='submit']")).click();
		Thread.sleep(3000);
		Actions ele = new Actions(driver);
//		ele.moveToElement(driver.findElement(By.xpath("//div[text()='Mobiles']"))).click().pause(3000).build().perform();
		driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
		Thread.sleep(5000);
		List<WebElement> Menu_ele = driver.findElements(By.cssSelector("#container span path"));
		
		ele.moveToElement(Menu_ele.get(1)).pause(2000).build().perform();
		ele.moveToElement(Menu_ele.get(0)).pause(2000).build().perform();
		ele.moveToElement(driver.findElement(By.xpath("//a[@title='Samsung'][@class='_3QN6WI']"))).click().build().perform();
	//	driver.findElement(By.xpath("(//div[@class='_37K3-p']//div[@class='_2n7i6c'])[1]")).click();
		String parentWindow=driver.getWindowHandle();
		Thread.sleep(5000);
		List<WebElement> samsung = driver.findElements(By.xpath("//div[@class='_37K3-p']//div[@class='_2n7i6c']"));
		
		for(int i=1; i<=samsung.size(); i++)
		{
			driver.findElement(By.xpath("(//div[@class='_37K3-p']//div[@class='_2n7i6c'])["+i+"]")).click();
			/*
			 * Set<String>s=driver.getWindowHandles();
			 * 
			 * // Now iterate using Iterator Iterator<String> I1= s.iterator();
			 * 
			 * while(I1.hasNext()) {
			 * 
			 * String child_window=I1.next(); driver.switchTo().window(child_window);
			 * Thread.sleep(2000); }
			 */
			Thread.sleep(2000);
			driver.switchTo().window(parentWindow);
			Thread.sleep(2000);
		}
			
		
	//	samsung.get(0).click();
	}

}
