package org.patern.Number;

import java.util.Scanner;
/*
		1
		21
		321
		4321
		54321

 */
public class ReverseNumberPattern 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers of lines :- ");
		int n = sc.nextInt();
		sc.close();
		
		printPattern(n);
	}
	
	private static void printPattern(int n)
	{
		for(int i = 1; i <= n; i++)
		{
			for(int j = i; j >=1; j--)
				System.out.print(j);
			System.out.println();
		}
	}

}
