package day9;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class D9CE1 {
	int a,b,c;
  @Test(dataProvider = "dp")
  public void add(Integer a, Integer b) {
	  c=a+b;
	  System.out.println("sum: " +c);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 10, 5 },
      new Object[] { 12, 6 },
    };
  }
  
  @Test(dataProvider = "dp")
  public void subtract(Integer a, Integer b) {
	  c=a+b;
	  System.out.println("difference: " +c);
  }

  @Test(dataProvider = "dp")
  public void multiply(Integer a, Integer b) {
	  c=a*b;
	  System.out.println("product: " +c);
  }

  @Test(dataProvider = "dp")
  public void divide(Integer a, Integer b) {
	  c=a/b;
	  System.out.println("quotient: " +c);
  }
}
