package Basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testng100 {

	@BeforeClass 
	public void browserlnch() {
		System.out.println("browser is launch");
	}
	
	@AfterClass
	public void teardown() {
		System.out.println("browser is close");
	}
	
	@Test
	public void m4() {
		System.out.println("m4 mthd");
	}
	
	@Test
	public void m5() {
		System.out.println("m5 mthd");
	}
	
	
	
	
	
	
	
	
	
	
	
}
