package day7;

//import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class D7E2 {
	int a,b,c;
	@BeforeSuite
	void getdata(){
		
		a=7;
		b=4;
	}
@Test
public void add() {
	  c=a+b;
	  Assert.assertEquals(c,11);
}


public void sub() {
	  c=a-b;
	  Assert.assertEquals(c, 3);
}

public void mul() {
	  c=a*b;
	  Assert.assertEquals(c, 28);
}

public void div()
{
	  Assert.assertEquals(c, 1);
}

}