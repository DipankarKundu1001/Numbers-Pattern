package org.patern.Number;

import java.util.Scanner;

/*
	1
	12
	123
	1234
	12345

 */
public class NumberTrag 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers of lines :- ");
		int n = sc.nextInt();
		sc.close();
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j <= i; j++)
			{
				System.out.print(j+1);
			}
			System.out.println();
		}
	}

}
