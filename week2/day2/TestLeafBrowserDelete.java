package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeafBrowserDelete {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager"); //User name
		driver.findElement(By.id("password")).sendKeys("crmsfa");  //Password
		driver.findElement(By.className("decorativeSubmit")).click(); //Login button
		Thread.sleep(2000);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//div[@class='frameSectionBody']//a[text()='Find Leads']")).click();//Finding lead
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("44"); - Not able to find any value based on this so commented this line
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("44");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		String leadid = driver.findElement(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a)[1]")).getText();
		System.out.println(leadid);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a)[1]")).click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadid);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		String message = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(message);
	}
}