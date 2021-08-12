package Assertion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForEach {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hgopi\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		List<WebElement> elements=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement element : elements) {
		    element.click(); 
		    Thread.sleep(1000);
	
		 }
		driver.close();
		
	}

}
