package com.test.collection;

public class Emp {
private int age ;
	
	public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
	public Emp( int age )
	{
		super();
		this.age = age;
	}
/**
 * If want to make your own immutable object , 
 * it will be wiser to override the equals() and hashCode() methods.	
 */
	
	public int hashCode()
	{
		return age;
	}
	
	public boolean equals( Object obj )
	{
		boolean flag = false;
		Emp emp = ( Emp )obj;
		if( emp.age == age )
			flag = true;
		return flag;
	}
}
