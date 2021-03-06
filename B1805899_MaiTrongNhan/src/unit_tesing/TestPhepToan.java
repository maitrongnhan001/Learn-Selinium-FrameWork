package unit_tesing;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import thuvien.tinhtoan.PhepTinh;
public class TestPhepToan {
	
	@BeforeMethod
	public void BeforeTeseCase () {
		System.out.println("Before Tesecase");
	}
	
	@AfterMethod
	public void AfterTeseCase () {
		System.out.println("After Tesecase");
	}
	
	@Test(dataProvider="DataCong")
	public void TestCong (float value1, float value2, float result) {
		//test
		Assert.assertSame(PhepTinh.Op('+', value1, value2), result);
		
		System.out.println("After Tesecase");
	}
	
	@Test(dataProvider="DataTru")
	public void TestTru (float value1, float value2, float result) {
		//test
		Assert.assertSame(PhepTinh.Op('-', value1, value2), result);
	}
	
	@Test(dataProvider="DataNhan")
	public void TestNhan (float value1, float value2, float result) {
		//test
		Assert.assertSame(PhepTinh.Op('*', value1, value2), result);
	}
	
	
	@DataProvider(name="DataCong") 
 	public Object[][] TestDataCong() 
 	{ 
		ReadExcelFile config = new ReadExcelFile("/Users/trongnhan/Documents/Test Software/Work/TestData.xlsx"); 
 	 	  	 	 	 	 
 	 	int rows = config.getRowCount(0); 
 	 	 
 	 	Object[][] dataCong = new Object[rows][3]; 
 	 	 
 	 	for(int i = 0; i < rows; i++) 
 	 	{ 
 	 		dataCong[i][0] = config.getData(0, i, 0);  	 	 	
 	 		dataCong[i][1] = config.getData(0, i, 1); 
 	 		dataCong[i][2] = config.getData(0, i, 2); 
 	 	 	 
 	 	} 
 	 	 
 	 	return dataCong; 
 	} 
	
	@DataProvider(name="DataTru") 
 	public Object[][] TestDataTru() 
 	{ 
		ReadExcelFile config = new ReadExcelFile("/Users/trongnhan/Documents/Test Software/Work/TestData.xlsx"); 
 	 	  	 	 	 	 
 	 	int rows = config.getRowCount(1); 
 	 	 
 	 	Object[][] dataTru = new Object[rows][3]; 
 	 	 
 	 	for(int i = 0; i < rows; i++) 
 	 	{ 
 	 		dataTru[i][0] = config.getData(1, i, 0);  	 	 	
 	 		dataTru[i][1] = config.getData(1, i, 1); 
 	 		dataTru[i][2] = config.getData(1, i, 2); 
 	 	 	 
 	 	} 
 	 	 
 	 	return dataTru; 
 	} 
	
	@DataProvider(name="DataNhan") 
 	public Object[][] TestDataNhan() 
 	{ 
		ReadExcelFile config = new ReadExcelFile("/Users/trongnhan/Documents/Test Software/Work/TestData.xlsx"); 
 	 	  	 	 	 	 
 	 	int rows = config.getRowCount(2); 
 	 	 
 	 	Object[][] dataNhan = new Object[rows][3]; 
 	 	 
 	 	for(int i = 0; i < rows; i++) 
 	 	{ 
 	 		dataNhan[i][0] = config.getData(2, i, 0);  	 	 	
 	 		dataNhan[i][1] = config.getData(2, i, 1); 
 	 		dataNhan[i][2] = config.getData(2, i, 2); 
 	 	 	 
 	 	} 
 	 	 
 	 	return dataNhan; 
 	} 
	
	
	
}
