package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement elementusername=driver.findElement(By.id("username"));
		elementusername.sendKeys("Demosalesmanager");
		WebElement elementpassword=driver.findElement(By.id("password"));
		elementpassword.sendKeys("crmsfa");
		WebElement elementlogin = driver.findElement(By.className("decorativeSubmit"));
		elementlogin.click();
		WebElement elementCRMSFA=driver.findElement(By.linkText("CRM/SFA"));
		elementCRMSFA.click();
		WebElement elementLeads=driver.findElement(By.linkText("Leads"));
		elementLeads.click();
		WebElement subTab=driver.findElement(By.linkText("Create Lead"));
		subTab.click();
		WebElement CompanyName=driver.findElement(By.id("createLeadForm_companyName"));
		CompanyName.sendKeys("Wipro");
		WebElement Firstname=driver.findElement(By.id("createLeadForm_firstName"));
		Firstname.sendKeys("Shan");
		WebElement FirstnameLocal=driver.findElement(By.id("createLeadForm_firstNameLocal"));
		FirstnameLocal.sendKeys("textfile");
		WebElement Department=driver.findElement(By.name("departmentName"));
		Department.sendKeys("Software");
		WebElement Description=driver.findElement(By.name("description"));
		Description.sendKeys("Selenium is open source");
		WebElement Email=driver.findElement(By.name("primaryEmail"));
		Email.sendKeys("srishanmsc@gmail.com");
		WebElement Lastname=driver.findElement(By.id("createLeadForm_lastName"));
		Lastname.sendKeys("T");
		WebElement createLead=driver.findElement(By.className("smallSubmit"));
		createLead.click();
		WebElement Edit=driver.findElement(By.className("subMenuButton"));
		Edit.click();
		WebElement Description1=driver.findElement(By.name("description"));
		Description1.clear();
		WebElement ImportantNotes=driver.findElement(By.id("createLeadForm_importantNote"));
		ImportantNotes.sendKeys("It is impotent notes field to give feedback about selenium course");
		WebElement Update=driver.findElement(By.className("smallSubmit"));
		Update.click();
		String title = driver.getTitle();
		System.out.println(title);
		
		//driver.close();createLeadForm_importantNote
	}
}




