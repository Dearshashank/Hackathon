package Udemy;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GetCourseDetails extends DriverSetup {

	@Test
	public void GetDetails() throws InterruptedException{
		
		 for(int i =1 ;i<=3 ;i++){
			 
			 // Title 
			   String CourseName =driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[4]/div[1]/div[1]/div[5]/div[2]/div[ "+i+"]/div[1]/a[1]/div[1]/div[2]/div[1]/h4[1]")).getText();	   
			 
			   //Total hours                                  /html[1]/body[1]/div[2]/div[4]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/a[1]/div[1]/div[2]/div[4]/div[2]/div[1]/span[1]
			   String TotalHours = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[4]/div[1]/div[1]/div[5]/div[2]/div["+i+"]/div[1]/a[1]/div[1]/div[2]/div[2]/div[1]/span[2]")).getText();
			 
			   
			   String Rating = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[4]/div[1]/div[1]/div[5]/div[2]/div["+i+"]/div[1]/a[1]/div[1]/div[2]/div[5]/div[2]/div[1]/span[1]")).getText();
			   System.out.println(CourseName);
			   System.out.println(Rating);
			   System.out.println(TotalHours);
			   }
		    Thread.sleep(5000);
			driver.close();
	}
}
