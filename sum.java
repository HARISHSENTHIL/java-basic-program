package com.exercise;
import java.sql.Array;
import java.util.Scanner;

public class sum
{
	   public static void main(String[] args) 
   {
	        System.out.println("enter n:");
	        Scanner sc =new Scanner(System.in);
	        int n=sc.nextInt();
	        int []b=new int[n];
	        System.out.println("enter elements:");
	        for(int i=0;i<n;i++)
	        {
	            b[i]=sc.nextInt();
	        }
	        int x=0;
	        for(int i=0;i<n;i++)
	        {
	           x=x+b[i];
	        }
	        System.out.println(x);
	    }
	}

	
