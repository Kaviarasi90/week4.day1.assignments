package week4.day1.assignment;

import java.time.Duration;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class duplicateNamesinTable {
	public static void main(String[] args){
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@id='navbtn_stockmarket']")).click();
		driver.findElement(By.partialLinkText("NSE Bulk Deals")).click();
		WebElement table = driver.findElement(By.xpath("//div[@class='col-12 table-responsive']//table//tbody"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		List<String> asList = new ArrayList<String>();
		
		for (int i = 0; i <=rows.size(); i++) {		
				
				List<WebElement> cols = rows.get(i).findElements(By.xpath("//td[3]"));
			
		for(WebElement a:cols) {
			String text=a.getText();
			asList.add(text);
			
		}}
		
		System.out.println("Size of duplicate List: "+asList.size());
		System.out.println("Duplicate List: "+asList);
		
		Set<String> hash_Set = new LinkedHashSet<String>(asList);
		
		//Ensure whether there are duplicate Security names
		System.out.println("Size of no duplicate LinkedHashSet: "+hash_Set.size());
		System.out.println("no duplicate LinkedHashSet: "+hash_Set);
	}}