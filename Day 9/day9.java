package com.day7;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class day9 {
	int a,b,c;
	  @Test(dataProvider = "dp")
	  public void add(Integer a, Integer b) {
		  c=a+b;
		  System.out.print("Sum ="+c);
	  }
	  @Test(dataProvider = "dp")
	  public void sub(Integer a, Integer b) {
		  c=a-b;
		  System.out.print("Difference ="+c);
	  }
	  @Test(dataProvider = "dp")
	  public void product(Integer a, Integer b) {
		  c=a*b;
		  System.out.print("product ="+c);
	  }
	  @Test(dataProvider = "dp")
	  public void division(Integer a, Integer b) {
		  c=a+b;
		  System.out.print("Division ="+c);
	  }


	  @DataProvider
	  public Object[][] dp() {
	    return new Object[][] {
	      new Object[] { 12, 3 },
	      new Object[] { 40, 5 },
	    };
	  }
	}