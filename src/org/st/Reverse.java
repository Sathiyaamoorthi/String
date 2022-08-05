package org.st;

import javax.swing.Spring;

public class Reverse {
	 static String rev;
public static void main(String[] args) {
	String s="welcome java";
	
String sp[] = s.split(" ");
for (int i =sp.length-1; i>=0; i--) {
	rev= sp[i] + " ";
	System.out.print(rev);
}

}
}
