package org.patern.Number;

import java.util.Scanner;

/*
		1
		121
		12321
		1234321
		123454321

 */
public class NumberPattern 
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
			for(int j = 1; j <= i; j++)
				System.out.print(j);
			for(int j = i-1; j >=1; j--)
				System.out.print(j);
			System.out.println();
		}
	}

}
