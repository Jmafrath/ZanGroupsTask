package com.zangroups.task;

public class BubbleSortImp {
	public static void main(String[] args) {
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		int temp;
		
		  System.out.print("Before Sorting"); 
		  System.out.println("");
		  for (int res : arr) {
		  System.out.print(res + " "); }
		 
		
		for (int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(" ");
		System.out.println("After Sorting");
		
		for (int res : arr) {
			System.out.print(res+ " ");
		}
		}

}
