package First_Selinium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day1 {

	WebDriver driver;
	JavascriptExecutor jse; 
	
	public void invokeBrowser(){ 

	        try {
				System.setProperty("webdriver.chrome.driver","/Users/trongnhan/Documents/Test Software/Automatic Test Project/Selinium FrameWork/chromedriver"); 
				driver = new ChromeDriver(); 
				driver.manage().deleteAllCookies(); 
				driver.manage().window().maximize(); 
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
				driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); 
				 
				driver.get("http://www.edureka.co");
				
				searchCourse();
						
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 

	    } 
	
	
	public void searchCourse(){ 
		 
	      try { 
	        //driver.findElement(By.id("search-inp3")).click(); 
	    	driver.findElement(By.className("open_search_overlay")).click(); 
	    	  
	        driver.findElement(By.id("search-input")).sendKeys("Java"); 
	        
	        Thread.sleep(2000); 
	        
	        //driver.findElement(By.id("search-button-top")).click(); 
	        driver.findElement(By.id("search-input")).sendKeys(Keys.RETURN);
	        
	        jse = (JavascriptExecutor)driver;      
	        jse.executeScript("scroll(0, 1200)"); //execute a script      
	        driver.findElement(By.xpath("//*[@id='add-master-courses']/a[8]/div[1]/div[2]/div[1]/h3")).click(); 
	        
	        
	      } catch (InterruptedException e) { 
	        // TODO Auto-generated catch block 
	        e.printStackTrace(); 
	      } 
	         
	    } 
	public static void main(String[] args) {
		  day1 myObj = new day1(); 
	      myObj.invokeBrowser(); 
	
		// TODO Auto-generated method stub
		//System.out.println("Hello!");
		
	}

}