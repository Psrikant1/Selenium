package testExamples;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_Testng {
      @BeforeMethod
	public void login() {
		System.out.println("login completed");
	}
      @AfterMethod
	public void logout() {
		System.out.println("logout completed");
	}
      @Test(priority=1)
      public void addEmp() {
    	  System.out.println("Add new empolyee");
      }
      @Test(priority=2)
      public void deleteEmp() {
    	System.out.println("Delete empolyee");  
      }
}
