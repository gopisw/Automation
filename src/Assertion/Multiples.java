package Assertion;

import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiples {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hgopi\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.edureka.co/");
		driver.manage().window().maximize();
		String parent=driver.getWindowHandle();
		driver.findElement(By.cssSelector(".ga_corporate_click")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> i = windows.iterator();
		while(i.hasNext())
		{
			String child_window = i.next();

			if(!parent.equals(child_window))
			{
				driver.switchTo().window(child_window);
				Thread.sleep(5000);
				System.out.println(driver.switchTo().window(child_window).getTitle());
				driver.close();
				
			}
			driver.switchTo().window(parent);
			System.out.println(driver.switchTo().window(parent).getTitle());
		}
		
	}


}
