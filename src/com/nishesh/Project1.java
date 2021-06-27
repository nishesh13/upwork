package com.nishesh;

public class Project1 {

	public static void main (String[] args) 
    { 
        for(int i=1;i<=100;i++) {
        	StringBuilder str= new StringBuilder();
        	if(i%3==0) {
        		str.append("Fizz");
        	}
        	if(i%5==0) {
        		str.append("Buzz");
        	}
        	if(str.length()==0) {
        		str.append(i);
        	}
        	System.out.println(str.toString());
        }
    }
	
}
