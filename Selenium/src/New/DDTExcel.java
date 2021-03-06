 package New; 
 import org.openqa.selenium.By; 
 import org.openqa.selenium.WebDriver; 
 import org.openqa.selenium.chrome.ChromeDriver; 
 import org.testng.Assert; 
 import org.testng.annotations.AfterMethod; 
 import org.testng.annotations.DataProvider;
 import org.testng.annotations.Test; 
 
public class DDTExcel { 
 	 
 	// TODO Auto-generated method stub 
 	 
 	 
 	WebDriver driver;   
 	 
 	 protected static String result; 
 	 
 	@Test(dataProvider="testdata") 
 	public void DemoProject(String username, String password) 
 	{ 
 	 	 
 	 	try { 
 	 	 	System.setProperty("webdriver.chrome.driver", "/Users/trongnhan/Documents/Test Software/Automatic Test Project/Selinium FrameWork/chromedriver"); 
 	 	 	driver = new ChromeDriver();  
 	 	 	//driver.get("http://newtours.demoaut.com/");  	 	 	
 	 	 	driver.get("http://demo.guru99.com/test/newtours/"); 
 	 	 	 
 	 	 	driver.findElement(By.name("userName")).sendKeys(username); 
 	 	 	driver.findElement(By.name("password")).sendKeys(password); 
 	 	 	 
// 	 	 	driver.findElement(By.name("username")).sendKeys(username);  	 	 	
// 	 	 	driver.findElement(By.name("password")).sendKeys(password); 
 	 	 	 
 	 	 	driver.findElement(By.name("submit")).click();  
 	 	 	 
 	 	 	//driver.findElement(By.xpath("//*[@id='login']/div[3]/input")).click();  
 	 	 	 
 	 	 	 	 	 
 	 	 	Thread.sleep(5000); 
 	 	 	 
 	 	 	Assert.assertTrue(driver.getTitle().matches("Login: Mercury Tours"), "Invalid credentials"); 
 	 	 	System.out.println("Login successful"); 
 	 	 	 
// 	 	 	 result = driver.findElement(By.xpath("//*[@id='pageheader']/div/div/a[2]")).getText(); 
// 	 	 	  
// 	 	 	 System.out.println(result); 
// 	          	 Assert.assertEquals(result, "Thoát ra"); 
 	 	 	 
 	 	} catch (InterruptedException e) {  	 	 	
 	 		// TODO Auto-generated catch block  	 	 	
 	 		e.printStackTrace(); 
 	 	} 
 	} 
 	 
 	@AfterMethod 
 	void ProgramTermination() 
 	{ 
 	 	driver.quit(); 
 	} 
 	 
 	@DataProvider(name="testdata") 
 	public Object[][] TestDataFeed() 
 	{ 
 	 	//New.ReadExcelFile config = new New.ReadExcelFile("C:\\Users\\Vardhan\\workspace\\Selenium\\LoginCreadentials.xlsx"); 
 	 	New.ReadExcelFile config = new New.ReadExcelFile("/Users/trongnhan/Documents/Test Software/Work/LoginCredentials.xlsx"); 
 	 	  	 	 	 	 
 	 	int rows = config.getRowCount(0); 
 	 	 
 	 	Object[][] credentials = new Object[rows][2]; 
 	 	 
 	 	for(int i=0; i<rows; i++) 
 	 	{ 
 	 	 	credentials[i][0] = config.getData(0, i, 0);  	 	 	
 	 	 	credentials[i][1] = config.getData(0, i, 1); 
 	 	 	 
 	 	} 
 	 	 
 	 	return credentials; 
 	} 
 	 
} 
