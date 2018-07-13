package com.modify;


import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.generic.STKClass;

public class Modify {
	
	
  @Test
  public void f(ITestContext context) {
	  

	  STKClass.gen=context.getCurrentXmlTest().getParameter("browser");
  }
}
