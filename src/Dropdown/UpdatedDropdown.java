package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\users\\hgopi\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		int i = 1;
		while(i<5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
//		for(int i=1;i<4;i++)
//		{
//		driver.findElement(By.id("hrefIncAdt")).click();
//		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
//		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox'])")).size());
		System.out.println(driver.findElement(By.cssSelector("input[id=ctl00_mainContent_chk_SeniorCitizenDiscount]")).isSelected());
		driver.findElement(By.cssSelector("input[id=ctl00_mainContent_chk_SeniorCitizenDiscount]")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id=ctl00_mainContent_chk_SeniorCitizenDiscount]")).isSelected());
		

	}

}
