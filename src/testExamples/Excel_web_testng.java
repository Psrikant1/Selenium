package testExamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import jxl.Workbook;
import jxl.Sheet;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import java.io.FileInputStream;
import org.testng.annotations.Test;
public class Excel_web_testng {
	
     WebDriver driver;
     @BeforeClass
     public void excel() {
    	 driver = new ChromeDriver();
     }
     @AfterClass
     public void testng() {
    	 driver.close();
     }
     @Test
     public void tc002() throws Exception{
    	 FileInputStream file = new FileInputStream("C:\\Users\\91778\\OneDrive\\Documents\\LoginHRMS.xls");
    	 Workbook wb = Workbook.getWorkbook(file);
    	 Sheet st = wb.getSheet(0);
    	 
    	 String username = st.getCell(0,1).getContents();
    	 String password = st.getCell(1,1).getContents();
    	 
    	 driver.navigate().to("http://183.82.103.245/nareshit/login.php");
    	 Reporter.log("Open Application");
    	 System.out.println("Open Application");
    	 driver.findElement(By.name("txtUserName")).sendKeys(username);
    	 driver.findElement(By.name("txtPassword")).sendKeys(password);
    	 Thread.sleep(3000);
    	 driver.findElement(By.name("Submit")).click();
    	 Reporter.log("Logout Completed");
    	 System.out.println("Logout Completed");
    	 driver.findElement(By.linkText("Logout")).click();
    	 Thread.sleep(3000);
    	 }
}
