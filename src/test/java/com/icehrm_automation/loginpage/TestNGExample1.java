package com.icehrm_automation.loginpage;
 
//example for mathamatics

import org.testng.annotations.Test;

public class TestNGExample1 {
  @Test
  public void method() {
	  System.out.println("This is test1 method");
  }
  @Test
  public void add() {
	int a=100;
	int b=200;
	  System.out.println("This is a addition method");
	  System.out.println("addition of a and b is :"+ (a+b));
	  }
  @Test
  public void multipication() {
	int c=10;
	int d=20;
	  System.out.println("This is a multipication method");
	  System.out.println("multipication of a and b is:" + (c*d));
  }
  @Test
  public void substraction() {
	int a=300;
	int b=200;
	  System.out.println("This is a substraction method");
	  System.out.println("substraction of a and b is :"+ (a-b));
  }
  @Test
  public void division() {
	int a=20;
	int b=10;
	  System.out.println("This is a division method");
	  System.out.println("division of a and b is:" +(a/b));
	  
  }
      }

