//With Arg Without return

/*class withargwithoutret
{
	public static void main(String args[])
	{
		withargwithoutret ab = new withargwithoutret();		
		ab.sum(5,6);
	}
	void sum(int x,int y)  
	{
		int add = x+y;
		System.out.print(add);
	}
}*/

//using scanner class 

import java.util.*;
class Ex17{
	public static void main(String args[])
	{
		withargwithoutret ab = new withargwithoutret();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number 1 ");
		int a = sc.nextInt();
		System.out.print("Enter number 2 ");
		int b = sc.nextInt();
		ab.main(a,b);
		
	}
	void main(int a,int b)
	{
		int add = a+b;
		System.out.print("The add is "+add);
	}
}