package com.exercise;
import java.util.Scanner;
public class art {

	public static void main(String[] args) {
		char input;
		System.out.println("enter no.of");
		Scanner ch = new Scanner(System.in);
		int choice;
		do {
			System.out.println("1.add\n2.sub\n3.multiple\n4.1division\n");
			choice=ch.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("enter the two number:");
					int num1 = ch.nextInt() , num2 = ch.nextInt(); 
					System.out.println(num1+num2);
					break;
				case 2:
					System.out.println("enter the two number:");
					int num3 = ch.nextInt() , num4 = ch.nextInt(); 
					System.out.println(num3-num4);
					break;
				case 3:
					System.out.println("enter the two number:");
					int num5 = ch.nextInt() , num6 = ch.nextInt(); 
					System.out.println(num5*num6);
					break;
				case 4:
					System.out.println("enter the two number:");
					int num7 = ch.nextInt() , num8 = ch.nextInt(); 
					System.out.println(num7/num8);
		}
		}while(choice!=4);
}
	
}
	


