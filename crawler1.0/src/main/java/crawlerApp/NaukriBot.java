package crawlerApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class NaukriBot {

	@SuppressWarnings("static-access")
	public static void run(WebDriver driver) {
			
			//login
			driver.get("https://login.naukri.com/nLogin/Login.php");
			driver.findElement(By.tagName("input").id("emailTxt")).sendKeys("anshulmohil@hotmail.com");;
			WebElement pass = driver.findElement(By.tagName("input").id("pwd1"));
			
			pass.sendKeys("ankeyveera13");
			pass.submit();
			
			// updating profile
			driver.findElement(By.className("leftNavBullet")).findElement(By.tagName("a")).click();
			driver.findElement(By.tagName("button")).click();
	}

}
