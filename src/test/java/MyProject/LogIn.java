package MyProject;

import org.testng.annotations.Test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;




public class LogIn {
	public static void main(String args[]) throws InterruptedException{
	}
	WebDriver driver = new FirefoxDriver();

		@BeforeMethod
		
		public void openUrl(){
		driver.get("http://www.harborfreight.com/");
		driver.manage().window().maximize();
		
		
		try{
			Thread.sleep(8000);
			driver.findElement(By.cssSelector("#welcome_close")).click();
			System.out.println("unexpected alert present");
			}
		catch(Exception e)
			{ 
			 System.out.println("unexpected alert not present");   
			}	}
	
		@Test
		
		public void Actualtest(){
		driver.findElement(By.cssSelector("#myaccountlogin>a:nth-child(1)")).click(); 
		driver.findElement(By.cssSelector("#email")).sendKeys("divya.dimple1209@gmail.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("vijay@123");
		driver.findElement(By.cssSelector("#sign-in-button")).click(); 

		
		String s;
			  s = driver.findElement(By.cssSelector(".sub-title-text")).getText();
			  Assert.assertEquals(s, "LOGGED IN AS:");
			  System.out.print("Logged in Successfully");
			  
			 
			 // WebElement ImageFile = driver.findElement(By.xpath("//images.harborfreight.com/hftweb/newhome11/images/footer-confidence1.jpg,'Test Image')]"));
	
			  
			  
			  
		}
		@AfterMethod	
		public void QuitDriver(){
			  driver.quit();
		}
}
			  //}

			
		
	


