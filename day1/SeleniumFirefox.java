package week2.day1;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumFirefox {
public static void main(String[] args) {
	WebDriverManager.firefoxdriver().setup();
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize(); 
	driver.close();
}
}
