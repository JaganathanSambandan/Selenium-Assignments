package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeafBrowserCreate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager"); //User name
		driver.findElement(By.id("password")).sendKeys("crmsfa");  //Password
		driver.findElement(By.className("decorativeSubmit")).click(); //Login button
		Thread.sleep(2000);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infy");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jagan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("JS");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Payments Tester");
		driver.findElement(By.name("description")).sendKeys("Test");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jaganat84@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(2000);
		String n = driver.getTitle();
		System.out.println(n);
		
	}
	
}
