//WAP to count digit of an integer number given by user using class and method

import java.util.*;
class QB494
{
	public static void main(String args[])
	{
		QB494 ab = new QB494();
		ab.sum();
		
	}
	void sum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number");
		int n = sc.nextInt();
		int count=0;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		System.out.print("Total numbers are"+count);
	}
}