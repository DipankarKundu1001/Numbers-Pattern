package org.patern.Number;

import java.util.Scanner;
/*
		1
		10
		101
		1010
		10101

 */
public class OneZeroTrangle 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Lines :- ");
		int n = sc.nextInt();
		sc.close();
		
		printPattern(n);
	}
	
	private static void printPattern(int n)
	{
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j <= i; j++)
			{
				if(j%2 == 0)
					System.out.print("1");
				else
					System.out.print("0");
			}
			System.out.println();
		}
	}

}
