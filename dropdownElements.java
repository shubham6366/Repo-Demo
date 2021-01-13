package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.yatra.com");
		WebElement dropdown = driver.findElement(By.xpath("//span[text()='+ More']"));
		Thread.sleep(3000);
		
		//Create ACTION Class Object
		Actions a=new Actions(driver);
		
		//Move mouse cursor over dropdown
		Actions a1 = a.moveToElement(dropdown);
		Thread.sleep(3000);
		
		//to execute actions class method call perform method
		a1.perform();
		
		Thread.sleep(3000);
		//click on dropdown option
		driver.findElement(By.xpath("//span[text()='Insurance']")).click();
		
		

	}

}
