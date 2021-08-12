package Assertion;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiples2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hgopi\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Windows.html");
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("(//button[contains(text(),click)])[2]")).click();
		Set<String> windows=driver.getWindowHandles();
		for(String window : windows)
		{
			if(!parent.equals(window)) 
			{
				driver.switchTo().window(window);
				Thread.sleep(3000);
				System.out.println(driver.getTitle());
				driver.close();
			}
			
		}
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();

	}

}
