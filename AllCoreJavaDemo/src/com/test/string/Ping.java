package com.test.string;

public class Ping extends Utils{

	public static void main(String[] args) throws Exception {
Utils u = new Ping();
System.out.println(u.getInt(args[0])); //line 7
	}
	int getInt(String args){
	return Integer.parseInt(args);
}
}

class Utils {
	int getInt(String x) throws Exception{return 7;}
}
/**
 * Line 7 , add throws at main method or keep getInt in try/catch block
 * 
 */
