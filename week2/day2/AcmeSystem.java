package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcmeSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
		driver.close();
		
	}

}
