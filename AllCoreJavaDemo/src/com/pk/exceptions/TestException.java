package com.pk.exceptions;

public class TestException {

	public static void main(String[] args) {
try{
	int a=10,b=1,c=0;
	c = a/c;
	System.out.println("c value "+c);
}catch(ArithmeticException e){
	System.out.println("at ArithmeticException");
	e.printStackTrace();
}catch(Exception e){
	System.out.println("at Exception");
	e.printStackTrace();
}
finally{
	System.out.println("finally");
}
	}

}
