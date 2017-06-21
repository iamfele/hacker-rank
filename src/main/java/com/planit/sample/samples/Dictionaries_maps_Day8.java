package com.planit.sample.samples;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionaries_maps_Day8 {

    public static void main(String []argh){
          Scanner in = new Scanner(System.in);
          Map<String, Integer> myMap = new HashMap<String, Integer>();
          int n=in.nextInt();
          in.nextLine();
        
          for(int i=0;i<n;i++){
            String name=in.next();
            int phone=in.nextInt();
            myMap.put(name, phone);
            in.nextLine();
          }
        
          while(in.hasNext()){
            String s=in.nextLine();
            if (myMap.containsKey(s)) {
                System.out.println(s+"="+myMap.get(s));
            } else {
                System.out.println("Not found");
            }
          }
      }
	
}
