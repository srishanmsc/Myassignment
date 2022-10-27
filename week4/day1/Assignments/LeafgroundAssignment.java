package week4.day1.Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundAssignment {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// 2. Enter UserName and Password Using Id Locator
		WebElement elementusername = driver.findElement(By.id("username"));
		elementusername.sendKeys("Demosalesmanager");
		WebElement elementpassword = driver.findElement(By.id("password"));
		elementpassword.sendKeys("crmsfa");
		
		// 3. Click on Login Button using Class Locator
		WebElement elementlogin = driver.findElement(By.className("decorativeSubmit"));
		elementlogin.click();
		
		// 4. Click on CRM/SFA Link
		WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMSFA.click();
		
		// 5. Click on contacts Button
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		// Click on Merge Contacts using Xpath Locator
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();

		// Click on Widget of From Contact
		driver.findElement(By.xpath("//a/img[@src='/images/fieldlookup.gif']")).click();
		Set<String> windowHandles = new LinkedHashSet<String>(driver.getWindowHandles());
		List<String> winlist = new ArrayList<String>(windowHandles);
		driver.switchTo().window(winlist.get(1));

		// Click on First Resulting Contact
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

		// Click on Widget of To Contact
		
		driver.switchTo().window(winlist.get(0));

		driver.findElement(By.xpath("(//a/img[@src='/images/fieldlookup.gif'])[2]")).click();
		Set<String> windowhandles2 = new LinkedHashSet<String>(driver.getWindowHandles());
		List<String> winlist2 = new ArrayList<String>(windowhandles2);
		// Switch control to new window
		driver.switchTo().window(winlist2.get(1));
						
		// Click on Second Resulting Contact
		WebElement Secondresult = driver.findElement(By.xpath("(//a[@class='linktext'])[5]"));
		Secondresult.click();
		
		// Switch control to main window
		driver.switchTo().window(winlist.get(0));
		
		// Click on Merge button using Xpath Locator
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		
		// Accept the alert
		Alert accept = driver.switchTo().alert();
		accept.accept();
		
		// Verify the title of the page
		String text = driver.getTitle();

		if (text.equalsIgnoreCase("View")) {
			System.out.println("Account merged");
		} else {
			System.out.println("Account not merged");
		}

	}

}
