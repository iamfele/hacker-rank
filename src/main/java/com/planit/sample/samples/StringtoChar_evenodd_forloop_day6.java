package com.planit.sample.samples;

import java.util.Scanner;

public class StringtoChar_evenodd_forloop_day6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int L=in.nextInt();
		
		for(int j=0;j<L;j++){
		
		String S = in.next();
		// System.out.println(S);
		char[] T = S.toCharArray();
		StringBuffer d0=new StringBuffer();
		for (int i = 0; i < T.length; i++) {
			if (i % 2 == 0) {
				char T1 = T[i];
			
				d0.append(T1);
			}
		}
		StringBuffer d1=new StringBuffer();
		String T3 = null,T4;
		for (int i = 0; i < T.length; i++) {
			if (i % 2 == 1) {
				char T2 = T[i];
		
				d1.append(T2);
				
			}
			
		}
		System.out.println(d0+" "+d1);
		}
	}
}
