package week4.day1.Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafground {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Clicks and confirm new window opens
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		// To give control to new window use getwindowhandles and convert set to list
		// and then switch control
		Set<String> newwindow = driver.getWindowHandles();
		List<String> newwindow1 = new ArrayList<String>(newwindow);
		driver.switchTo().window(newwindow1.get(1));
		// new window title to confirm
		System.out.println(driver.getTitle());
		// verification
		if (driver.getTitle().contentEquals("Dashboard")) {
			System.out.println("new window open properly");
		} else {
			System.out.println("New window not opened properly");
		}
		// Clicks and confirm new window opens window closed
		driver.close();
		// switch control to main window
		driver.switchTo().window(newwindow1.get(0));
		// Open multiple tabs
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> Multiplewindows = driver.getWindowHandles();
		List<String> Multiplewin = new ArrayList<String>(Multiplewindows);
		driver.switchTo().window(Multiplewin.get(1));
		System.out.println(driver.getTitle());

		if (driver.getTitle().contentEquals("Dashboard")) {
			System.out.println("Its dashboard window");
		} else {
			System.out.println("Wrong window");
		}
		driver.switchTo().window(Multiplewin.get(2));
		System.out.println(driver.getTitle());
		if (driver.getTitle().contentEquals("Web Table")) {
			System.out.println("it is Web Table window");
		} else {
			System.out.println("it is not Web Table window");
		}
		driver.close();

		// switch control to main window
		driver.switchTo().window(Multiplewin.get(0));
		// Close window tab
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();

		Set<String> tabs = driver.getWindowHandles();
		List<String> tabList = new ArrayList<String>(tabs);

		System.out.println("Close tab size: " + tabList.size());

		int temp = 0;

		for (int i = 1; i < tabList.size(); i++) {
			driver.switchTo().window(tabList.get(i));

			System.out.println("Window opened and closed: " + driver.getTitle());

			driver.close();

			driver.switchTo().window(tabList.get(0));
			temp++;
		}

		System.out.println("No of windows opened and closed: " + temp);
	
	//Delay tab
		driver.switchTo().window(newwindow1.get(0));
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		Set<String> delaytabs = driver.getWindowHandles();
		List<String> delaytab1 = new ArrayList<String>(delaytabs);
		driver.switchTo().window(delaytab1.get(1));
		System.out.println(driver.getTitle());
		
			}
}
