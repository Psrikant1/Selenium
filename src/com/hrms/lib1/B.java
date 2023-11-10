package com.hrms.lib1;
import org.openqa.selenium.By;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.hrms.utility.Log;

public class B extends A {
	
	   public void openApplication() {
       driver = new ChromeDriver();
       driver.navigate().to(url);
       System.out.println("Open Application");
       Reporter.log("Open Application");
       Log.info("Open application");
       
	 }
	   public void login() throws Exception{
		   driver.findElement(By.name(txt_loginname)).sendKeys(username); 
		   driver.findElement(By.name(txt_password)).sendKeys(password); 
		   driver.findElement(By.name(btn_login)).click();
		   Thread.sleep(4000);
		   System.out.println("Login completed");
		   Log.info("Login completed");
	   }
	   public void enterFrame() {
		   driver.switchTo().frame(empinfo_frame);
		   System.out.println("Enter frame");
		   Log.info("Enter frame");
	   }
	   public void addEmp() {
		   driver.findElement(By.xpath(btn_Add)).click();
		   driver.findElement(By.name(txt_efn)).sendKeys(efn);;
		   driver.findElement(By.name(txt_eln)).sendKeys(eln);;
		   driver.findElement(By.id(btn_save)).click();
		   System.out.println("Add new Empolyee");
		   Log.info("Add new Empolyee");
	   }
	   public void existFrame() {
		   driver.switchTo().defaultContent();
		   System.out.println("Exist frame");
		   Log.info("Exist frame");
	   }
	   
	   public void logout() {
		   driver.findElement(By.linkText("Logout")).click();
		   System.out.println("Logout completed");
		   Log.info("Logout Completed");
	   }
	   public void closeApplication() {
		   driver.close();
		   System.out.println("Close Application");
		   Log.info("Close Application");
	   }
}
