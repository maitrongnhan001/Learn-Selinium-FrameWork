package Bookings;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class pmtdp {
	@Test(dataProvider="myData1")
	public void testcase1(String uname, String pwd) {
		System.out.println("Testcase 1 should now run for sets of users");
		System.out.println(uname);
		System.out.println(pwd);
	}
	
	@Test(dataProvider="myData1")
	public void testcase2(String uname, String pwd) {
		System.out.println("Testcase 2 should now run for sets of users");
		System.out.println(uname);
		System.out.println(pwd);
	}
	
	
	@DataProvider(name="myData1")
	public Object[][] myDataProvider1() {
		Object[][] obj = new Object[4][2];
		
		obj[0][0] = "user1";
		obj[0][1] = "pwd1";
		obj[1][0] = "user2";
		obj[1][1] = "pwd2";
		obj[2][0] = "user3";
		obj[2][1] = "pwd3";
		obj[3][0] = "user4";
		obj[3][1] = "pwd4";
		
		return obj;
	}

}
