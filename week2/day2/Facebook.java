package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
		driver.findElement(By.name("firstname")).sendKeys("Jaganathan");
		driver.findElement(By.name("lastname")).sendKeys("S");
		driver.findElement(By.name("reg_email__")).sendKeys("9876543210");
		driver.findElement(By.id("password_step_input")).sendKeys("123456@asdf");
		WebElement day=driver.findElement(By.name("birthday_day"));
		Select s=new Select(day);
		s.selectByVisibleText("3");
		WebElement month=driver.findElement(By.name("birthday_month"));
		Select t=new Select(month);
		t.selectByVisibleText("Aug");
		WebElement year=driver.findElement(By.name("birthday_year"));
		Select u=new Select(year);
		u.selectByVisibleText("1994");
		driver.findElement(By.xpath("//span[@class='_5k_3']//input")).click();
		System.out.println("Execution has completed");				
		
	}
}
