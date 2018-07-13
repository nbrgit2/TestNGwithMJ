package com.generic;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.IInvokedMethodListener;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class GenTest {
	
	
	static String browser=null;
	static String site=null;
	
  @Test
  public void f(ITestContext context) {

	//  System.out.println(context.getName());
	  STKClass.gen=context.getCurrentXmlTest().getParameter("browser");
	  System.out.println(STKClass.gen);
	  
  }
 

  @BeforeMethod
  public void beforeMethod() {
	  
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  
  }


}
