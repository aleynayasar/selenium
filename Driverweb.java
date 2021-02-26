package driverpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driverweb {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("http://google.com");
	    WebElement element = driver.findElement(By.name("q"));
	    element.sendKeys("ctech");
	    element.submit();
	    Thread.sleep(3000);
	    driver.quit();
	    
	    
	    
		
	}

}
