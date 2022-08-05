package org.st;

public class SpecialRemoval {
public static void main(String[] args) {
	String s="Pr!^&ogr#am%m123";
	char ch;
	String res="";
	String res1="";
	
	for (int i = 0; i<s.length(); i++) {
		 ch = s.charAt(i);
		if (ch>64 && ch<=90  ) {
			res=res+ch;
		}
		else if (ch>97 && ch<=122) {
			res=res+ch;
		}
		else {
			res1=res1+ch;
		}
	}
	System.out.println(res);
	System.out.println(res1);
}}
