package com.icehrm_automation;

public class DemoLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathsFuntional mf = (c,d )-> {
			int result =c-d;
			return result;	  
			};
		int subs =mf.substraction(30,20);
		System.out.println(subs);
	}

}
