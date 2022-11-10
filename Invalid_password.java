import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invalid_password {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\iulian.osman\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.ryanair.com/ro/ro");
		
		//parola gresita introdusa
		driver.findElement(By.xpath("//button[@class='cookie-popup-with-overlay__button']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Conectare']")).click();
		driver.findElement(By.xpath("//input[@placeholder='email@email.com']")).sendKeys("NUEXISTA@yahoo.com");
		driver.findElement(By.xpath("//input[@placeholder='Parolă']")).sendKeys("123456");
		driver.findElement(By.tagName("ry-auth-submit")).click();
		System.out.println(driver.findElement(By.xpath("//span[@class='b2 _error ng-star-inserted']")).getText());
	}

}
