package RunningTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Raptor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hgopi\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.collegeraptor.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@data-modal='#modal_login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='Username']")).sendKeys("arabandigopi@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Manveesh1234$");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='col-xs-12 col-sm-12 text-center']//a[@href='/Account/LogOff']")).click();
		driver.close();
	}

}
