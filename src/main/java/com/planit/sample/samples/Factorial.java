package com.planit.sample.samples;

import java.util.Scanner;

public  class Factorial {
	//static int factorial;
//static int n;


	static int Factorial(int n) {


		if(n==0||n==1)
	        return 1;
	    else 
	        return n*Factorial(n-1);
	}
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		 int N = in.nextInt();

		
		
		
System.out.println(Factorial(N));

in.close();
	}
}
