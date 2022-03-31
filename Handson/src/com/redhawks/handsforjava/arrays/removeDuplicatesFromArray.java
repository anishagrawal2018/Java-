package com.redhawks.handsforjava.arrays;

public class removeDuplicatesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,2,3,4,5,1,2};
		int []result=new int[a.length];
		int size=0;
		for(int i=0;i<a.length;i++) {
			boolean flag=false;
			for(int j=0;j<size;j++) {
				if(a[i]==result[j]){
					flag=true;					
				}
			}
			if(flag==false) {
				result[size]=a[i];
				size++;
			}
		}
	
	
	for (int i=0;i<size;i++) {
		System.out.println(result[i]);
		
	}
}
}
		
	