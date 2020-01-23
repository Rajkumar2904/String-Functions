package org.str;

import java.util.Scanner;

public class Ques6 {
public static void main(String[] args) {
	System.out.print("Enter Your Address: ");
	Scanner in=new Scanner(System.in);
	String a=in.next();
	boolean i = a.matches("\\d{6}");
	if (i==true) {
		System.out.println("Valid Address");
	}
	else {
		System.out.println("Invalid Address");
	}
}
}
