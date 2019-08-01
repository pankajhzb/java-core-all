package com.test.string;

public class Input {
	public static void main(String[] args) {
String s = "-";
try{
	doMath(args[0]);
	s +="t";	//line 8
}
finally{System.out.println(s += "f");}
	}
public static void doMath(String a){
	int y=7 / Integer.parseInt(a);
}
}

//java Input
//java Input 0
//Since both exception occured within a try block ,the finally block will always execute.
 
