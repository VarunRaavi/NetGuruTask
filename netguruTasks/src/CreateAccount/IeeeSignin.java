package CreateAccount;



	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class IeeeSignin  {
		@Test
		
		public void ExistingEmail() {
		
			System.setProperty("webdriver.chrome.driver", "D:\\java\\chromedriver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.ieee.org/");
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			driver.findElement(By.id("mn-signin-link")).click();
			WebElement EmailAddress=driver.findElement(By.name("pf.username"));EmailAddress.sendKeys("mfsm2@kfkd.com");
			WebElement Password=driver.findElement(By.name("pf.pass"));Password.sendKeys("b_a49gb%HKY/P+y"); 
			WebElement Signin=driver.findElement(By.id("modalWindowRegisterSignInBtn")); Signin.click();
}
}