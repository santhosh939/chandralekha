package org.info;

public class EmployeeInfo {
	
	public static void main(String[] args) {
		
		
		int[] a= new int[10];
		
		
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		a[5]=6;
		a[6]=7;
		a[7]=8;
		a[8]=9;
		a[9]=10;
		
		int Sum =0;
		
		int l = a.length;
		System.out.println("length of the array:"+l); 
		
		for (int i=0;i<a.length;i++)
			
		Sum = Sum + a[i];
		System.out.println("sum of the value is:"+Sum);
		
	}
}
