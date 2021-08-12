package Assertion;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hgopi\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/guru99home");
		Thread.sleep(3000);
		List<WebElement> size= driver.findElements(By.tagName("iframe"));
		System.out.println(size.size());
//		driver.switchTo().frame(0);
		driver.switchTo().frame("a077aa5e");
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		Set<String> windows=driver.getWindowHandles();
		for(String window:windows) 
		{
			if(!parent.equals(window)) {
				driver.switchTo().window(window);
				System.out.println(driver.getTitle());
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();
	}

}
