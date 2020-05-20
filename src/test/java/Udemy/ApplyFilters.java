package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ApplyFilters extends DriverSetup{

	
	@Test
	public void Filter() throws InterruptedException{
		
		 driver.findElement(By.xpath("//span[contains(text(),'Filter')]")).click();
		   
		   Thread.sleep(2000);
		   
		   driver.findElement(By.xpath("//fieldset[@name='Level']/div[2]/label[1]/span[1]")).click();
		   
		   Thread.sleep(3000);
		   
		   driver.findElement(By.xpath("//fieldset[@name='Language']/div[1]/label[1]/span[1]")).click();
		   
		   Thread.sleep(3000);
		   
		   driver.findElement(By.xpath("//button[@class='filter-panel--done-button--3eVhr btn btn-primary']")).click();
	}
}
