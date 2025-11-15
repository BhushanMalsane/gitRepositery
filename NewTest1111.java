package com.testng;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class NewTest1111 {
  @Test(priority='b')
  public void Login() {
	  System.out.println("i am in login test case");
  }
  @Test(priority='a')
  public void Reg() {
	  System.out.println("i am in Reg test case");
  }
  @Test(priority=1)
  public void Home() {
	  System.out.println("i am in Home test case");
  }
  @Test(priority=2)
  public void Logout() {
	  throw new SkipException("We are working");
//	  System.out.println("i am in Logout test case");
  }
  @Test(enabled = false)
  public void Abc() {
	  System.out.println("i am in Abc test case");
  }
}
