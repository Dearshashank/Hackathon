package Udemy;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GetCourseDetails extends DriverSetup {

	@Test
	public void GetDetails() throws InterruptedException{
		
		 for(int i =1 ;i<=3 ;i++){
			   String CourseName =driver.findElement(By.xpath("//*[@id='udemy']/div[2]/div[3]/div/div/div[5]/div[2]/div["+i+"]/div/a/div/div[2]/div[1]/h4")).getText();	   
			   String Rating = driver.findElement(By.xpath("//*[@id='udemy']/div[2]/div[3]/div/div/div[5]/div[2]/div["+i+"]/div/a/div/div[2]/div[5]/div[2]/div/span[1]")).getText();
			   String totalHours = driver.findElement(By.xpath("//*[@id='udemy']/div[2]/div[3]/div/div/div[5]/div[2]/div["+i+"]/div/a/div/div[2]/div[2]/div/span[2]")).getText();
			   System.out.println(CourseName);
			   System.out.println(Rating);
			   System.out.println(totalHours);
			   }
		    Thread.sleep(5000);
			driver.close();
	}
}
