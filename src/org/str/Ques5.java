package org.str;

import java.util.Scanner;

public class Ques5 {
public static void main(String[] args) {
	System.out.print("Enter your EmailId: ");
	Scanner in=new Scanner(System.in);
	String a=in.next();
	boolean i = a.contains("@");
	if (i==true) {
		System.out.println("Valid Email Id.");
	}
	else {
		System.out.println("Invalid email Id");
	}
	
}
}
