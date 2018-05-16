package com.specific;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class CommonTest  implements ITestListener {
	
	static String browser=null;
	static String site=null;
	
  @Test
  public void f() {
	  
	  System.out.println(browser);
	  System.out.println(site);
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }
@Override
public void onFinish(ITestContext arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void onStart(ITestContext arg0) {
	browser=arg0.getCurrentXmlTest().getParameter("browser");
	site=arg0.getCurrentXmlTest().getParameter("site");
	
}
@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void onTestFailure(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void onTestSkipped(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void onTestStart(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void onTestSuccess(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}

}
