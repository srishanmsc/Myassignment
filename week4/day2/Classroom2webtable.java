package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Classroom2webtable {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://erail.in/");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement fromstatation = driver.findElement((By.xpath("//input[@id='txtStationFrom']")));
		fromstatation.clear();
		fromstatation.sendKeys("ms");
		fromstatation.sendKeys(Keys.TAB);
		
		WebElement fromto = driver.findElement((By.xpath("//input[@id='txtStationTo']")));
		fromto.clear();
		fromto.sendKeys("mdu");
		fromto.sendKeys(Keys.TAB);
		
		driver.findElement(By.xpath(("//input[@id='chkSelectDateOnly']"))).click();
	List<WebElement> alltrainnamesize= driver.findElements(By.xpath("//table//tbody//th"));
	int size = alltrainnamesize.size();
	System.out.println(size);
	
	for(int i=2;i<=size;i++) {
	String trainnames = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr["+i+"]//td[2]")).getText();
	System.out.println(trainnames);
	 
	}
	//List<WebElement> alltrains = driver.findElements(By.xpath("//table//tbody//th[i]"));
//ltrains.g
	
	
}}
