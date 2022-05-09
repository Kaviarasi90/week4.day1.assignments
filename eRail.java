package week4.day1;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class eRail {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.cssSelector("input[id='txtStationFrom']")).clear();
		driver.findElement(By.cssSelector("input[id='txtStationFrom']")).sendKeys("MDU",Keys.ENTER);
		driver.findElement(By.cssSelector("input[id='txtStationTo']")).clear();
		driver.findElement(By.cssSelector("input[id='txtStationTo']")).sendKeys("TPJ",Keys.ENTER);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		driver.findElement(By.id("buttonFromTo")).click();
		WebElement table = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']"));
		
		List<WebElement> rows = table.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[1]"));
		for (int i = 1; i < rows.size(); i++) {
			System.out.println(rows.get(i).getText());
			
		}}}
