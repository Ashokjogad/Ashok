package ngscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Facebooklogin extends Generic{
	@Test
	public void validlogin() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("manager");
		driver.findElement(By.name("login")).click();
		Thread.sleep(4000);
		String title = driver.getTitle();
		System.out.println(title);
		
		
	}
	

}
