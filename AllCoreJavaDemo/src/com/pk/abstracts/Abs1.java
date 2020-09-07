package com.pk.abstracts;
abstract class Abs1 {
	int i=10;
	String ia = "us2008123456";
	public Abs1(int i, String ia){
		this.i=i;
		this.ia=ia;
	}
	public abstract void abc();
	protected abstract void abc(int x);
	protected abstract void ghi();
	@SuppressWarnings("unused")
	private void def(){
		System.out.println("I am at abstract class with defined method");
	}
}
