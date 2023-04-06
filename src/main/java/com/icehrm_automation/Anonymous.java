package com.icehrm_automation;

public class Anonymous {

	public static void main(String[] args) {
		Mathematics maths =new Mathematics() {
			
			public int addition(int a, int b) {
				int resultadd=a+b;
				// TODO Auto-generated method stub
				return resultadd;
			}
			
			public int substraction(int a, int b) {
				int resultsub=a-b;
				// TODO Auto-generated method stub
				return resultsub;
			}
			
			public int multiplication(int a, int b) {
				int resultmult=a*b;
				// TODO Auto-generated method stub
				return resultmult;
			}
			
			public int division(int a, int b) {
				int resultdiv=a/b;
				// TODO Auto-generated method stub
				return resultdiv;
			}
			
			
		};
		int result1= maths.addition(30,20);
		int result2=maths.substraction(50,20);
		int result3=maths.multiplication(9,9);
		int result4=maths.division(20,10);
       
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		
	}
}
			
			
			
			
			
			
			
			
		


	


