package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Classroom1Servicenow {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://dev141516.service-now.com/");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement((By.xpath("//input[@class='form-control']"))).sendKeys("admin");
		driver.findElement((By.xpath("//input[@id='user_password']"))).sendKeys("India@123");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
}}

