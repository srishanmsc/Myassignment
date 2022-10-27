package week4.day1.Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandling {
	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement((By.id("username"))).sendKeys("ramkumar.ramaiah@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Password#123");
		driver.findElement(By.name("Login")).click();
		driver.findElement((By.xpath("//span[contains(text(),'Learn More')]"))).click();
		Set<String> windowHandles =new LinkedHashSet<String>( driver.getWindowHandles());
		List<String> winlist=new ArrayList<String>(windowHandles);
		driver.switchTo().window(winlist.get(1));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		System.out.println(driver.getTitle());
		driver.switchTo().window(winlist.get(0));
		System.out.println(driver.getTitle());
	}
		
}
