package week4.day1.assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class toyWithTables {
	public static void main(String[] args) {
		
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.leafground.com/pages/table.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement table = driver.findElement(By.xpath("//table"));
	List<WebElement> row = table.findElements(By.tagName("tr"));
//	System.out.println("Row Size is: "+row.size());
//	List<WebElement> col = table.findElements(By.tagName("th"));
//	System.out.println("Column Size is: "+col.size());
	
	//List<String> asList = new ArrayList<String>();
	for (int i = 0; i < row.size(); i++) {
		List<WebElement> column = row.get(i).findElements(By.tagName("td"));
		for  (int j = 0; j <column.size(); j++) {
			if(column.get(0).getText().equals("Learn to interact with Elements"))
			{
				String text=column.get(j).getText();
				System.out.println(text);
			}
			if(column.get(1).getText().equals("20%"))
			{
				driver.findElement(By.xpath("(//input[@name='vital'])[5]")).click();
				
			}
	
		}	
}System.out.println("Vital task for the least completed progress is checked");	
}}
