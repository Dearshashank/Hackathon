package Udemy;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WebDevelopment extends DriverSetup{

	@Test
	public void MouseOverWebDevelopment() throws InterruptedException{
		
		driver=Udemy.DriverSetup.getDriver();
		
		   Actions action = new Actions(driver);
		   
		   WebElement element = driver.findElement(By.xpath("//span[@class='udi udi-explore']"));
		   
		   action.moveToElement(element).build().perform();
		   
		   Thread.sleep(2000);
		  
		   WebElement element2 = driver.findElement(By.xpath("//li[@class='h100p']//li[1]//a[1]//span[2]"));
		   
		   action.moveToElement(element2).build().perform();
		   
		   Thread.sleep(2000);
		   
		   WebElement element3 = driver.findElement(By.xpath("//span[contains(text(),'Web Development')]"));
		   
		   action.moveToElement(element3).build().perform();
		   
		   Thread.sleep(2000);
		   
		   WebElement element4  = driver.findElement(By.xpath("//span[contains(text(),'All Web Development')]"));
		   
		   action.moveToElement(element4).build().perform();
		   
		   driver.findElement(By.xpath("//span[contains(text(),'All Web Development')]")).click();;
		  
		   Thread.sleep(2000);
		
	}
}
