package org.str;

public class Ques1 {
public static void main(String[] args) {
	String a="Greens Technology";
	int i = a.indexOf("e");
	System.out.println("Index of e in Greens Technology:"+i);
	String b="SeleniumAutomationTool";
	int j = b.indexOf("o");
	System.out.println("Index of o in SeleniumAutomationTool:"+j);
	String c="Velmurugan";
	int k = c.indexOf("n");
	System.out.println("Index of n in Velmurugan:"+k);
	String d="j a v a p r o g r a m";
	int l= d.lastIndexOf(" ");
	System.out.println("Last index of Emptyspace in j a v a p r o g r a m:"+l);
	String e="9095484678";
	int m = e.indexOf("8");
	System.out.println("Index of 8 in 9095484678:"+m);
}
}
