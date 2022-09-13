package com.exercise;
import java.sql.Array;
import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		  System.out.println("enter n:");
	        Scanner sc =new Scanner(System.in);
	        int n=sc.nextInt();
	        int []b=new int[n];
	        System.out.println("enter elements:");
	        for(int i=0;i<n;i++)
	        {
	            b[i]=sc.nextInt();
	        }
	        int temp=b[0];
	        b[0]=b[n-1];
	        b[n-1]=temp;
	        for(int i=0;i<n;i++)
	        {
	        	System.out.println(b[i]);
	        }
		

	}

}
