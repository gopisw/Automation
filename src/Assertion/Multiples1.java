package Assertion;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiples1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hgopi\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.edureka.co/");
		String parent = driver.getWindowHandle();
		driver.findElement(By.cssSelector(".ga_corporate_click")).click();
		Thread.sleep(5000);
		Set<String> windows = driver.getWindowHandles();
	//	System.out.println(driver.getTitle());
		for(String window:windows) {
			if(!parent.equals(window)) {
				driver.switchTo().window(window);	
				System.out.println(driver.getTitle());
				//	System.out.println(driver.findElement(By.xpath("//h1")).getText());
				driver.close();
			}

		}
		driver.switchTo().window(parent);	
		System.out.println(driver.getTitle());

	}

}
