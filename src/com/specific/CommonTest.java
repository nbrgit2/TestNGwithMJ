package com.specific;

import org.testng.annotations.Test;

import com.generic.STKClass;

import org.testng.annotations.BeforeMethod;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class CommonTest {
	
	static String browser=null;
	static String site=null;
	
  @Test
  public void f(ITestContext context) {
	  
	  System.out.println(context.getName());
	 
	  System.out.println(STKClass.gen);
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
