package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Classroom3IRCTC {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.findElement(By.partialLinkText("FLIGHTS")).click();
		Set<String> windowHandle = driver.getWindowHandles();
		
		List<String> listhandles=new ArrayList<String>(windowHandle);
		driver.switchTo().window(listhandles.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(listhandles.get(0));
		System.out.println(driver.getTitle());
		driver.close();
		
	}
		
}
