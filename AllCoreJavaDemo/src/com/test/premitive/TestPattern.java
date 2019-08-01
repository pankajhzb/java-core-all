package com.test.premitive;

public class TestPattern {

	public static void main(String[] args) {
System.out.println("hi");
char[] carr = {'g','o','o','d'};
int i=0,j=1,counter=0;
boolean flag = false;
while(j<carr.length){
	if(carr[i]==carr[j]){
		counter++;
		j++;
		System.out.println(i +","+j+","+counter);
		//flag=true;
		//continue;
	}else{
		j++;
	}
	System.out.println(i +","+j+","+counter);
	continue;
}
	}

}
