package com.hrms.javascript1;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib1.B;

public class TC001 {
	@Test
        public void tc001() throws Exception{
		
        DOMConfigurator.configure("log4j.xml");
        	
		B b = new B();
		b.openApplication();
		b.login();
		b.logout();
		b.closeApplication();
     }
}
 