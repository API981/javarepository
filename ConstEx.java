package com.sero;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ConstEx{

	int div(int a,int b) throws Exception
	{
		return a/b;
				}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=0;
		ConstEx obj = new ConstEx();
		try {
		int c=obj.div(a, b);
		System.out.println(c);
		}
		catch(ArithmeticException e){
			System.out.println("here "+e);
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		LinkedList<Integer> arr = new LinkedList<>();
		arr.add(3);
		arr.add(4);
		arr.add(7);
		
		System.out.println(arr);
		arr.add(2, 8);
		System.out.println(arr);
		arr.remove(3);
		System.out.println(arr);
		LinkedList<Integer> dup = new LinkedList<>();
		dup=(LinkedList<Integer>)arr.clone();
		System.out.println("Duplicate: "+dup);
	}

}
