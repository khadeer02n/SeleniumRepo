import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
	
	public static final String HOME_URL="https://www.google.com/";
	public static final String searchBar="//textarea[@id='APjFqb']";
	public static final String googlesearchButton="//div[@class='FPdoLc lJ9FBc']//child::input[@class='gNO89b']";
	/*
	public static final String searchBar="//textarea[@id='APjFqb']";
	public static final String searchBar="//textarea[@id='APjFqb']";
	public static final String searchBar="//textarea[@id='APjFqb']";
	public static final String searchBar="//textarea[@id='APjFqb']";
	public static final String searchBar="//textarea[@id='APjFqb']";
	*/
	@Test
	static void verifyElements() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(HOME_URL);
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(searchBar)).sendKeys("Amazon");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(googlesearchButton)).click();
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
