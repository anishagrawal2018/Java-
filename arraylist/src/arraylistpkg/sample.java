package arraylistpkg;

import java.util.ArrayList;
import java.util.List;

public class sample {

	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7,8,9};
		
		int i=0;

		/*for ( i=0; i<arr.length;i++){
		
			System.out.println((arr[i] +""));
			
		}*/
		arr = separateevenodd(arr);

		for(int i1=0; i1<arr.length; i1++){
			System.out.println((arr[i1] +""));
		}
		}
		public static int[] separateevenodd(int arr[]){
		
		int arr1[]= {};
		int left = 0;
		int right =arr.length-1;
		for (int i=0;i<arr.length; i++){
			
		if(arr[i%2]==0)
		{
		arr[left]=arr[i];
		left++;
		
		}
		/*else {
		//int l=arr1.length;
			
			arr[arr.length-1]=arr[i];
		}
		
		
		/*while(arr[right%2]==1){
		right--;}
		if(left<right){
		int temp=arr[left];       
		arr[left]=arr[right];           
		arr[right]=temp;       
		}*/
		}
		return arr;
		}
		
		
	
}
