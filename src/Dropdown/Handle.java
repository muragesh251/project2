package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sugarcrm.com/au/request-demo");
		Thread.sleep(2000);
		WebElement ddown=driver.findElement(By.name("employees_c"));
		Select select=new Select(ddown);
		Thread.sleep(2000);
		select.selectByValue("level1");
		Thread.sleep(2000);
		select.selectByVisibleText("11 - 50 employees");
		Thread.sleep(2000);
		select.selectByIndex(5);
		driver.quit();
		

	}

}
