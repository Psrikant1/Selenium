package testExamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Webdriver_Testng {
	
       WebDriver driver;
      
       @BeforeClass
       public void web() {
    	   driver = new ChromeDriver();
       }
       @AfterClass
       public void ng() {
    	   driver.close();
       }
       
       @Test
       public void tc001() throws Exception{
    	   driver.navigate().to("http://183.82.103.245/nareshit/login.php");
    	   Reporter.log("Open Application");
    	   System.out.println("open applicatoin");
    	   driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
    	   driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
    	   Thread.sleep(4000);
    	   driver.findElement(By.name("Submit")).click();
    	   System.out.println("Login Completed");
    	   Thread.sleep(3000);
    	   Reporter.log("Login Completed");
    	   driver.findElement(By.linkText("Logout")).click();
    	   Reporter.log("Logout copmpleted");
    	   //Thread.sleep(4000);
       }
}
