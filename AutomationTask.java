package AutomationAmazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationTask {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

		// open website
		driver.get("https://www.amazon.com");

		// maximize the open window
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//search the desired item
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("tp-link n450 wifi router-wireless internet router for home tl-wr940n");
		Thread.sleep(1000);
		
		//click on search box
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		Thread.sleep(1000);
		
		//click on the First item shown 
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/span/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();
		Thread.sleep(1000);
		
		//click on Add to Cart button
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		Thread.sleep(1000);
		
		//click on Cart
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[4]/div[1]/span[2]")).click();
		Thread.sleep(2000);
	
		driver.close();
		
	}

}
