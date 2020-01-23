package org.str;

import java.util.Scanner;

public class Ques4 {
public static void main(String[] args) {
	System.out.println("Enter the String a and b: ");
	Scanner in=new Scanner(System.in);
	String a=in.nextLine();
	String b=in.next();
	boolean i = a.equalsIgnoreCase(b);
	System.out.println(i);
}
}
