/*class withargwithret
{
	public static void main(String args[])
	{
		withargwithret ab = new withargwithret();
		int ans =ab.sum(10,20);
		System.out.print("The add is"+ans);
	}
	int sum(int x,int y)
	{
		int c=x+y;
		return c;
	}
}*/

//using scanner class

import java.util.*;
class withargwithret
{
	public static void main(String args[])
	{
		withargwithret ab = new withargwithret();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number 1");
		int p = sc.nextInt();
		System.out.print("Enter number 2");
		int q = sc.nextInt();
		
		int ans = ab.sum(p,q);
		System.out.print("The sum is"+ans); 
	}
	int sum(int a,int b)
	{
		int c=a+b;
		return c;
	}
	
}