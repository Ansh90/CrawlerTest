package crawlerApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LinkedInUpdateProfileBot {

	@SuppressWarnings("static-access")
	public static void run(WebDriver driver) {

		 
		driver.get("https://www.linkedin.com/");
		WebElement user = driver.findElement(By.id("login-email"));
		WebElement pass = driver.findElement(By.id("login-password"));
		user.sendKeys("er.manpreetkaur@hotmail.com");
		pass.sendKeys("manpreet28");
		pass.submit();
		
		driver.findElement(By.tagName("li").className("nav-item").partialLinkText("profile")).click();
		driver.findElement(By.tagName("div").id("background-summary")).click();
		driver.findElement(By.tagName("textarea").name("expertise_comments")).clear();
		driver.findElement(By.tagName("textarea").name("expertise_comments")).sendKeys("Hey its manpreet");
		driver.findElement(By.className("btn-primary")).click();
		
	}
}
