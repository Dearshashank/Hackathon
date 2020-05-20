package Udemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DriverSetup {

	public static WebDriver driver = null ;
	
	public static String URL ="https://www.udemy.com" ;
	
	
	public static WebDriver getDriver(){
		
		String UptoProject = System.getProperty("user.dir");   // Upto the project path
		String Completepath= UptoProject + "\\BrowserDrivers\\chromedriver.exe";   // upto the driver exe file
		System.setProperty("webdriver.chrome.driver",Completepath); 
		   
		WebDriver driver = new ChromeDriver();
		   
		driver.manage().window().maximize();
		
		driver.get(URL);
		
		return driver ;
		 
	}
}
