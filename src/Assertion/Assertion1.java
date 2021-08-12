package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion1 {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\users\\hgopi\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	//	Assert.assertFalse(driver.findElement(By.cssSelector("input[id=ctl00_mainContent_chk_SeniorCitizenDiscount]")).isSelected());
		driver.findElement(By.cssSelector("input[id=ctl00_mainContent_chk_SeniorCitizenDiscount]")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id=ctl00_mainContent_chk_SeniorCitizenDiscount]")).isSelected());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
	//	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		int i = 1;
		while(i<5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		try {
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "Adult");
		}
		catch(Exception ex)
		{	
			/*
			 * System.out.println("throw an error"); System.out.println("exception is "+ex);
			 */
		}
		finally {
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		}
		//System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
