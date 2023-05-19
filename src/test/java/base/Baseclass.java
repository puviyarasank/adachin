package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	WebDriver driver;
@Test
public void browser() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\PUVI\\eclipse-workspace\\mavenproject\\Driver\\chromedriver.exe");
driver = new ChromeDriver();
	driver.get("https://www.bestbuy.com/");

}
}
