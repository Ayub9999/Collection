package com.wipro.ayub;

import java.util.ArrayList;

public class Arraylist {//print the arraylist

	public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(10);
	al.add(20);
	al.add(30);
	for(int a:al) {
		System.out.println(a);
	}
	}

}
