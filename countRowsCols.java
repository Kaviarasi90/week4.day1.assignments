package week4.day1.assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class countRowsCols {
	public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://html.com/tags/table/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	List<WebElement> row = driver.findElements(By.xpath("//table//tr[1]"));
	System.out.println("row size "+row.size());
	
	List<WebElement> col = driver.findElements(By.xpath("//table//tr[1]//td[1]"));
	System.out.println("col size "+col.size());
	
	
	}	

}
