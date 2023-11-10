 package com.hrms.javascript1;

import com.hrms.lib1.B;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

public class TC002 {
	@Test
	public void tc002() throws Exception{
		DOMConfigurator.configure("log4j.xml");
		
     B b = new B();
     b.openApplication();
     b.login();
     b.enterFrame();
     b.addEmp();
     b.existFrame();
     b.logout();
     b.closeApplication();
	}
}
