package com.planit.sample.samples;

import java.util.Scanner;

public class Reversing_integerarray_Day7 {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] arr = new int[n];
	        for(int i=0; i < n; i++){
	            arr[i] = in.nextInt();
	        }
	        in.close();
	        System.out.println(arr.length);
	        for(int j=arr.length-1;j>=0;--j){
	        	System.out.print(arr[j]+" ");
	        	
	        }
 
	 }
}
