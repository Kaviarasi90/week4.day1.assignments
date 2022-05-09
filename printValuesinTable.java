package week4.day1.assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class printValuesinTable {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement table = driver.findElement(By.xpath("//div[@class='render']//table//tbody"));
		List<WebElement> row = table.findElements(By.tagName("tr"));
		
		for (int i = 0; i < row.size(); i++) {
			List<WebElement> col = row.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < col.size(); j++) {
				if(col.get(0).getText().equals("Absolute Usage")) {
					String text=col.get(j).getText();
					System.out.println(text);
				}
				}
		}
		
}}
