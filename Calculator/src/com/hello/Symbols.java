package com.hello;

public class Symbols {
	public static void main(String [] args){
		char i;
		
		for(i=0;i<256;i++){
			int str=(int)i;
			System.out.println("ASCII value of " +str+ " is "+i); 

		}
	}
}