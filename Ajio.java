package week3.day2;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Ajio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ChromeDriver driver=new ChromeDriver();
		
		//Launch Website
	driver.get("https://www.ajio.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Search for Bags
    driver.findElement(By.name("searchVal")).sendKeys("Bags");
	driver.findElement(By.className("rilrtl-button")).click();

		//Select Gender - Men
	driver.findElement(By.xpath("//label[@for='Men']")).click();
	driver.navigate().refresh();
	driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();

		//Total no of items found
	System.out.println("Total no of items found :"+driver.findElement(By.xpath("//div[@class='length']")).getText());

		//List of Brand of the Men's Fashion Bag
    
	List<WebElement>ElementList = driver.findElements(By.xpath("//div[@class='brand']"));
	System.out.println("List of brands : ");
	for(WebElement link:ElementList) {
	System.out.println(link.getText()+",");
	}
	}
}
