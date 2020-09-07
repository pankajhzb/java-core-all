package com.pk.collection;

public class ConcreteBean {
	ConcreteBean(String name,int age) {
		this.name = name;
		this.age=age;
	}
	private String name;
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean equals(Object obj){
		if(obj == null)
			return false;
		ConcreteBean cb = (ConcreteBean)obj;
		if(this == cb){
			return true;
		}else{
			return(this.name.equals(cb.getName())&& (this.age == cb.getAge()));
		}
	}
	public int hashCode(){
		int hash = 9;
		hash = 17 * hash + (name==null?0:name.hashCode());
		return hash;
	}
}
