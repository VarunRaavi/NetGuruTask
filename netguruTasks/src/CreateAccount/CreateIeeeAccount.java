package CreateAccount;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateIeeeAccount {
	@Test
	
	public void ExistingEmail() {
	
		System.setProperty("webdriver.chrome.driver", "D:\\java\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ieee.org/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(By.id("mn-calink-link")).click();
		 WebElement FirstName=driver.findElement(By.name("webAccountTO.firstName"));FirstName.sendKeys("varun");
		 WebElement LastName=driver.findElement(By.name("webAccountTO.lastName"));LastName.sendKeys("Raavi"); 
		  WebElement Email=driver.findElement(By.id("emailId")); Email.sendKeys("mfsm2@kfkd.com");
		  WebElement password=driver.findElement(By.id("accountRegPassword")); password.sendKeys("dnnd@123");
		  WebElement ConfirmPassword=driver.findElement(By.id("confirmPassword")); ConfirmPassword.sendKeys("dnnd@123");
		  WebElement Privacyapolicy=driver.findElement(By.name("privacyChk")); Privacyapolicy.click();
		  WebElement Createacc=driver.findElement(By.name("createAcctBtn")); Createacc.click();


	

}
}
