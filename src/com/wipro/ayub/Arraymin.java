package com.wipro.ayub;

public class Arraymin {

	public static void main(String[] args) {
	int arr[]= {1,5,6,2,7};
	int min=arr[0];
	int max=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<min) {
			min=arr[i];
		}
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	
	System.out.println( "min no of= "+min);
	
	System.out.println("max no of="+ max);
	
	}
	
	}


